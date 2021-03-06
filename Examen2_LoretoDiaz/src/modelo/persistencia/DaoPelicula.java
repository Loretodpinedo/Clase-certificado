
package modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import modelo.entidad.Pelicula;


public class DaoPelicula {
	
	private Connection conexion;
	
	public boolean abrirConexion () {
		
		String url = "jdbc:mysql://localhost:3306/peliculas?serverTimezone=" + TimeZone.getDefault().getID();
		String usuario = "root";
		String password = "root";
		
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
	
	
	public boolean alta(Pelicula pelicula) {
		if (!abrirConexion()) {
			return false;
		}
		
		String query = "insert into peliculas (titulo,director,genero,aņoPublicacion) values (?,?,?,?)";

		try {
			PreparedStatement ps = conexion.prepareStatement(query);
		
			ps.setString(1, pelicula.getTitulo());
			ps.setString(2, pelicula.getDirector());
			ps.setString(3, pelicula.getGenero());
			ps.setString(4, pelicula.getAņoPublicacion());

			

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
			
			cerrarConexion();
		}
	}
	
	public boolean modificar(Pelicula pelicula) {
		if (!abrirConexion()) {
			return false;
		}
		String query = "update peliculas set titulo=?, director=?, genero=?, aņoPublicacion=? where id=?";

		try {
			
			PreparedStatement ps = conexion.prepareStatement(query);
			
			ps.setString(1, pelicula.getTitulo());
			ps.setString(2, pelicula.getDirector());
			ps.setString(3, pelicula.getGenero());
			ps.setString(4, pelicula.getAņoPublicacion());
			ps.setInt(5, pelicula.getId());

			

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
			
			cerrarConexion();
		}
	}
	
	public boolean borrar(int id) {
		if (!abrirConexion()) {
			return false;
		}
		String query = "delete from peliculas where id=?";

		try {

			PreparedStatement ps = conexion.prepareStatement(query);

			ps.setInt(1, id);

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
	
	public Pelicula obtener(int id) {
		if (!abrirConexion()) {
			return null;
		}
		String query = "select id,titulo, director, genero, aņoPublicacion from peliculas where id=?";

		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			

			Pelicula pelicula = null;
			
			while (rs.next()) {
				pelicula = new Pelicula();
				pelicula.setId(rs.getInt(1));
				pelicula.setTitulo(rs.getString(2));
				pelicula.setDirector(rs.getString(3));
				pelicula.setAņoPublicacion(rs.getString(4));
				pelicula.setAņoPublicacion(rs.getString(5));
			}
			return pelicula;
		} catch (SQLException e) {
			System.out.println("Error al mostrar la pelicula");
			e.printStackTrace();
			return null;
		} finally {
			cerrarConexion();
		}
	}
	
	public List<Pelicula> listar() {
		if (!abrirConexion()) {
			return null;
		}
		String query = "select id, titulo, director, genero, aņoPublicacion from peliculas";
		try {

			PreparedStatement ps = conexion.prepareStatement(query);

			ResultSet rs = ps.executeQuery();

			Pelicula pelicula = null;

			List<Pelicula> listaPeliculas = new ArrayList<Pelicula>();

			while (rs.next()) {
				pelicula = new Pelicula();
				pelicula.setId(rs.getInt(1));
				pelicula.setTitulo(rs.getString(2));
				pelicula.setDirector(rs.getString(3));
				pelicula.setGenero(rs.getString(4));
				pelicula.setAņoPublicacion(rs.getString(5));

				listaPeliculas.add(pelicula);
			}
			return listaPeliculas;
		} catch (SQLException e) {
			System.out.println("Error al listar ");
			e.printStackTrace();
			return null;
		} finally {
			cerrarConexion();

		}

	}
	
		
	}


