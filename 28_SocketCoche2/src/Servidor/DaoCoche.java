package Servidor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.TimeZone;

import Servidor.Coche;

public class DaoCoche {

	private Connection conexion;

	public boolean abrirConexion() {
		String url = "jdbc:mysql://localhost:3306/ejercicios?serverTimezone=" + TimeZone.getDefault().getID();
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

	public boolean alta(Coche coche) {
		if (!abrirConexion()) {
			return false;
		}

		String query = "insert into coches (marca,modelo,matricula) values (?,?,?,?)";

		try {
			PreparedStatement ps = conexion.prepareStatement(query);

			ps.setString(1, coche.getMarca());
			ps.setString(2, coche.getModelo());
			ps.setString(3, coche.getMatricula());

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
}
