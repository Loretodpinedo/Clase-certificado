package modelo.negocio;

import java.util.List;

import modelo.entidad.Pc;

public class GestorPc {

	public boolean validar(Pc p) {
		
			if (p.getCliente().getDireccion().isEmpty() || p.getCliente().getEmail().isEmpty()
					|| p.getCliente().getNombre().isEmpty() || p.getProcesador().isEmpty() || p.getRam().isEmpty()) {
				return false;
			}else 
			return true;
		
	}
}
