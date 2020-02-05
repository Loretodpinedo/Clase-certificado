package curso.modelo.negocio;


import org.springframework.stereotype.Service;

import curso.modelo.entidad.Pedido;

@Service
public class GestorPc {
	
	public boolean validar(Pedido p) {
		
		if (p.getDirCliente().isEmpty()) {
			return false;
		}else if (p.getEmailCliente().isEmpty()) {
			return false;
		}else if (p.getNombreCliente().isEmpty()) {
			return false;
		}else if (p.getPc().getRam().isEmpty()) {
			return false;
		}else if (p.getPc().getProcesador().isEmpty()) {
			return false;
		}else {
		return true;
		}
}
}
