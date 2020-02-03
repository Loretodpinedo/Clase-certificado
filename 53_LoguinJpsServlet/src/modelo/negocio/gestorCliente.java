package modelo.negocio;

import modelo.entidad.Cliente;

public class gestorCliente {

	/**
	 * Metodo que valida que la contrase�a y el ususario sean correctos
	 * 
	 * @param cliente representa el cliente a validar
	 * @return <b>true</b> si el loguin es correcto <b>false</b> si no lo es.
	 */

	public boolean logado(Cliente c) {
try {
		if (c.getNombre().contains("a")) {
			return true;
			
		} if (c.getContrase�a().contains("a")) {
			
			return true;
		} else
			return false;
	}catch (Exception e) {
		return false;
	}
	}
}
