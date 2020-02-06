package curso.modelo.negocio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curso.modelo.entidad.Pedido;

@Service
public class GestorPc {
	//ESta es la manera clasica, Felix lo ha hecho asi
	//public boolean validar(Pedido p) {
	
	@Autowired
	private Pedido p;
	
	public boolean validar() {
		
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
