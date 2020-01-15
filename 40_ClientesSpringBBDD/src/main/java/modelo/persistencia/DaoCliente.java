package modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

import org.springframework.stereotype.Repository;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;

import modelo.entidad.Cliente;
import vista.MainCliente;

@Repository
public class DaoCliente {

	private Connection conexion;

	public boolean abrirConexion() {

		String url = "jdbc:mysql://localhost:3306/clientes?serverTimezone=" + TimeZone.getDefault().getID();
		String usuario = "root";
		String password = "root";

		try {
			conexion = DriverManager.getConnection(url, usuario, password);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public boolean cerrarConexion() {
		try {
			conexion.close();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public List<Cliente> getListaClientes() {
		if (!abrirConexion()) {
			return null;
		}

		String query = "select id,dni,nombre,edad from clientes";

		try {

			PreparedStatement ps = conexion.prepareStatement(query);

			ResultSet rs = ps.executeQuery();

			Cliente cliente = null;
			List<Cliente> listaClientes = new ArrayList<Cliente>();

			while (rs.next()) {
				cliente = MainCliente.context.getBean("cliente", Cliente.class);

				cliente.setDni(rs.getString(1));
				cliente.setNombre(rs.getString(2));
				cliente.setEdad(rs.getInt(4));

				listaClientes.add(cliente);
			}
			return listaClientes;
		} catch (SQLException e) {
			System.out.println("Error en el insertar");
			e.printStackTrace();
			return null;
		} finally {

			cerrarConexion();
		}
	}

	public int alta(Cliente cliente) {
		if (!abrirConexion()) {
			return 4;
		}

		String query = "insert into clientes (dni,nombre,edad) values(?,?,?)";

		try {

			PreparedStatement ps = conexion.prepareStatement(query);

			ps.setString(1, cliente.getDni());
			ps.setString(2, cliente.getNombre());
			ps.setInt(3, cliente.getEdad());

			int numeroFilas = ps.executeUpdate();
			if (numeroFilas == 0) {
				return 4;
			} else {
				return 0;
			}
		} catch (SQLException e) {
			System.out.println("Error en el insertar");
			e.printStackTrace();
			return 4;
		} finally {

			cerrarConexion();
		}
	}

	public Cliente buscarPorId(int id) {
		if (!abrirConexion()) {
			return null;
		}

		String query = "select id,dni,nombre,edad from clientes where id=?";

		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			Cliente cliente = null;

			while (rs.next()) {
				cliente = new Cliente();
				cliente.setDni(rs.getString(2));
				cliente.setNombre(rs.getString(3));
				cliente.setEdad(rs.getInt(4));
			}
			return cliente;

		} catch (SQLException e) {
			System.out.println("Error en el insertar");
			e.printStackTrace();
			return null;

		} finally {

			cerrarConexion();
		}
	}

	public List<Cliente> buscarPorNombre(String nombre) {
		if (!abrirConexion()) {
			return null;
		}

		String query = "select id,dni,nombre,edad from clientes where nombre=?";

		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setString(1, nombre);
			ResultSet rs = ps.executeQuery();

			Cliente cliente = null;

			List<Cliente> listaClientes = new ArrayList<Cliente>();

			while (rs.next()) {
				cliente = new Cliente();
				cliente.setDni(rs.getString(2));
				cliente.setNombre(rs.getString(3));
				cliente.setEdad(rs.getInt(4));

				listaClientes.add(cliente);
			}
			return listaClientes;
		} catch (SQLException e) {
			System.out.println("Error en el insertar");
			e.printStackTrace();
			return null;
		} finally {

			cerrarConexion();
		}
	}

	public boolean borrarPorId(int id) {
		if (!abrirConexion()) {
			return false;
		}
		String query = "delete from clientes where id=?";

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
			System.out.println("Error en el insertar");
			e.printStackTrace();
			return false;
		} finally {

			cerrarConexion();
		}
	}

}
