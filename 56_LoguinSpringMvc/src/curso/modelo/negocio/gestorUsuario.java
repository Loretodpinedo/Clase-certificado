package curso.modelo.negocio;

import org.springframework.stereotype.Service;

import curso.modelo.entidad.Usuario;

@Service
public class gestorUsuario {

	/**
	 * Metodo que valida que la contraseña y el ususario sean correctos
	 * 
	 * @param cliente representa el cliente a validar
	 * @return <b>true</b> si el loguin es correcto <b>false</b> si no lo es.
	 */

	public boolean logado(Usuario usu) {
try {
		if (usu.getNombre().contains("a") || usu.getNombre().contains("f") || usu.getNombre().contains("g")) {
			return true;
			
		} if (usu.getContraseña().contains("a")) {
			
			return true;
		} else
			return false;
	}catch (Exception e) {
		return false;
	}
	}
}
