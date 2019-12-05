package modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

import modelo.entidad.Coche;

/**
 * Esta clase se encarga de la persistencia con la clase coche. Esta clase hare
 * un CRUD (create, read, update y delete) sobre la entitdad coche. Un DAO es el
 * acronimo de DATA ACCES OBJET y es un objeto que suele encargarse de
 * interactuar los objetos coche con la base de datos.
 * 
 * Nosotros vamos a desarrolar este DAO mediante el API de java JDBC (java data
 * base conection), un API es un conjunto de librerias que proporcionan una
 * funcionalidad, y en este caso nos daran la funcionalidad para conectaronos a
 * una base de datoss. Hay otras APIs para acceso a datos como por ejemplo JPA
 * (Java Psersistence Api).
 * 
 * para usar JDBC O JPA, necesitamos los drivers de conexion que ha hecho el
 * proveedor de nuesta base de datos, en nuestro caso MYSQL, dependiendo de la
 * base de datos a la que nos conectemos, necesitaremos uns drivers u otros. por
 * ejemplo Oracle, Postgres, SQLite, etc.
 * 
 * Asi pues lo primero que tenemos que hacer es obtener los drivers e incluirlos
 * en nuestro proyecto. En nuestro caso necesitamos los drivers de Mysql 8.0,
 * ojo con la version, los meteremos en la carpeta lib (que tenemos que crear) y
 * a continuacion decirle a java que tiene que usar dichos dirvers, para ello
 * tenemos que modificar el classpath de nuestra aplicacion java. Classpath es
 * la variable de entorno que utiliza JAVA para buscar sus clases. Para
 * modificar el Classpath boton derecho sobre el proyecto >> build Path >>
 * configure Build Path
 * 
 * @author Loreto
 * @see Coche
 * @since 04-12-2019
 * @version 1.0
 * 
 *
 */

public class DaoCoche {

	// La interface Connection auna metodos para la conexion a base de datos.
	// Esto es una interface, el objeto que realiza la conexion
	// a la bbdd estan dentro de las librerias de MySql
	private Connection conexion;// Variable de la clase java.sql.Connection. Connection Es una interface.

	// Se utiliza en versiones anteriores a java 1.7
	// Este bloque se ejecutara
	// justo al cargar esta clase en la JVM, se ejecutara
	// antes que el metodo main
	// Vamos a decirle explicitamente que dirver tiene que usar.

	// static {
	// Le decimos a JAVA que cargue en memoria el driver
	// de conexion con la bbdd, para poder recuperarlo
	// cuando hagamos la conexion.
	// try {
	// Class.forName("com.mysql.cj.jdbc.Driver");
	// } catch (ClassNotFoundException e) {
	// System.out.println("Driver NO cargado");
	// e.printStackTrace();
	// }
	// }

	// Se pueden hacer tantas coexiones como quieras.
	public boolean abrirConexion() {
		// protocolo:subprotocolo://IP:PUERTO/NOMBRE_ESQUEMA
		String url = "jdbc:mysql://localhost:3306/ejercicios?serverTimezone=" + TimeZone.getDefault().getID();
		String usuario = "root";
		String password = "root";

		// getConecction devuelve un ojeto qeu lleva la conexion a la base de datos.
		// Esta clase (DriverManager) es la clase que lleva el control del driver.
		// EStamos aplicando la inyeccion de dependencias, es decir,
		// no creo el objeto aqui (no hago new), es el metodo getConection
		// el que me va a crear el objeto en mi lugar.
		try {
			conexion = DriverManager.getConnection(url, usuario, password);
			return true;
		} catch (SQLException e) {

			e.printStackTrace();
			return false;
		}

	}

	public boolean cerrarConexion() {
		try {
			conexion.close();
			return true;
		} catch (SQLException e) {

			e.printStackTrace();
			return false;
		}
	}

	public boolean alta(Coche coche) {
		if (!abrirConexion()) {
			return false;
		}
		/*
		 * Asi no se debe hacer,no es ni optimo,ni seguro para el motor de la base de
		 * datos. String query = "insert into coches (matricula,marca,modelo) " +
		 * "value (" + coche.getMatricula()+","+coche.getMarca()+coche.getModelo()+")";
		 */

		// Como hay que hacerlo es con consultas preparadas o parametrizadas.
		String query = "insert into coches (matricula,marca,modelo) values (?,?,?)";

		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			// sustituimos la primera interrogante pro la matricula del coche.
			ps.setString(1, coche.getMatricula());
			ps.setString(2, coche.getMarca());
			ps.setString(3, coche.getModelo());

			// Esta funcion me devuelve el numero de filas afectadas

			int numeroFilas = ps.executeUpdate();
			if (numeroFilas == 0) {
				return false;
			} else {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Error al insertar");
			e.printStackTrace();
			return false;
		} finally {
			// El bloque finally se va a ejecutar SIEMPRE
			// no importa si ha pasado por el try o por el catch
			cerrarConexion();
		}
	}

	public boolean modificar(Coche coche) {
		if (!abrirConexion()) {
			return false;
		}
		String query = "update coches set matricula=?, marca=?, modelo=? where id=?";

		try {
			// le decimos a la conexion que nos haga una consulta
			// parametrizamos a partir de la query anterior
			PreparedStatement ps = conexion.prepareStatement(query);
			// sustituimos la primera interrogante por la matricula de coche
			ps.setString(1, coche.getMatricula());
			ps.setString(2, coche.getMarca());
			ps.setString(3, coche.getModelo());
			ps.setInt(4, coche.getId());

			// Esta funcion me devuelve el numero de filas afectadas

			int numeroFilas = ps.executeUpdate();
			if (numeroFilas == 0) {
				return false;
			} else {
				return true;
			}

		} catch (SQLException e) {
			System.out.println("Error al insertar");
			e.printStackTrace();
			return false;
		} finally {
			// El bloque finally se va a ejecutar SIEMPRE, no importa si ha pasado por
			// el bloque try o por el bloque catch.
			cerrarConexion();
		}
	}

	public boolean borrar(Coche coche) {
		if (!abrirConexion()) {
			return false;
		}
		String query = "delete from coches where id=?";

		try {

			PreparedStatement ps = conexion.prepareStatement(query);

			ps.setInt(1, coche.getId());

			int numeroFilas = ps.executeUpdate();
			if (numeroFilas == 0) {
				return false;
			} else {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Error al borrar");
			e.printStackTrace();
			return false;
		} finally {
			cerrarConexion();
		}

	}

	public Coche obtener(int id) {
		if (!abrirConexion()) {
			return null;
		}
		String query = "select id,matricula, marca,modelo from coches where id=?";

		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			// ResultSet es un objeto que tiene toda la lista de registros queha devuelto
			// la consulta

			Coche coche = null;
			// asi pues, podemos recorrernos la lista.
			while (rs.next()) {// preguntamos si hay algun registro mas.
				coche = new Coche();
				coche.setId(rs.getInt(1));// el id esta en la primera posicion
				coche.setMatricula(rs.getString(2));
				coche.setMarca(rs.getString(3));
				coche.setModelo(rs.getString(4));
			}
			return coche;
		} catch (SQLException e) {
			System.out.println("Error al mostrar coche");
			e.printStackTrace();
			return null;
		} finally {
			cerrarConexion();
		}
	}

	public List<Coche> listar() {
		if (!abrirConexion()) {
			return null;
		}
		String query = "select id, matricula,marca,modelo from coches";
		try {

			PreparedStatement ps = conexion.prepareStatement(query);

			ResultSet rs = ps.executeQuery();

			Coche coche = null;

			List<Coche> listaCoches = new ArrayList<Coche>();

			while (rs.next()) {
				coche = new Coche();
				coche.setId(rs.getInt(1));
				coche.setMatricula(rs.getString(2));
				coche.setMarca(rs.getString(3));
				coche.setModelo(rs.getString(4));

				listaCoches.add(coche);
			}
			return listaCoches;
		} catch (SQLException e) {
			System.out.println("Error al listar ");
			e.printStackTrace();
			return null;
		} finally {
			cerrarConexion();

		}

	}
}
