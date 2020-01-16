package modelo.negocio;

import java.util.List;

import javax.swing.text.Position;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelo.entidad.Cliente;
import modelo.persistencia.DaoCliente;

@Service
public class GestorCliente {

	@Autowired
	private DaoCliente daocliente;

	public GestorCliente(DaoCliente daoCliente) {
		super();
		this.daocliente = daoCliente;
	}


	public DaoCliente getCliente() {
		return daocliente;
	}

	public void setCliente(DaoCliente daoCliente) {
		this.daocliente = daoCliente;
	}

	public List<Cliente> getListaClientes() {
		return daocliente.getListaClientes();
	}

	/**
	 * Dar de alta un cliente con un dni de 9 caracteres y que acabe en una letra
	 * 
	 * @param libro libro a dar de alta
	 * @return 0 en caso de que se haya dado de alta 1 en caso de que el dni no este
	 *         completo 2 en caso de que el dni no acabe en una letra 3 en caso de
	 *         que el dni ya exista en la bbdd
	 */

	public int alta(Cliente cliente) {

		if (cliente.getDni().length() != 9) {

			return 1;
		}
		if (!Character.isLetter(cliente.getDni().charAt(8))) {
			return 2;
		}
		if (buscarPorNombre(cliente.getDni()) != null) {
			return 3;
		}
		return daocliente.alta(cliente);
	}

	public List<Cliente> buscarPorNombre(String nombre) {
		return daocliente.buscarPorNombre(nombre);
	}

	public Cliente buscarPorId(int id) {
		return daocliente.buscarPorId(id);

	}

	public boolean borrarPorId(int id) {
		return daocliente.borrarPorId(id);
	}

}
