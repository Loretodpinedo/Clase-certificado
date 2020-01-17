package cfg;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
//@ComponentScan(basePackages = "modelo") Esto es para que valla a buscar anotaciones, 
//en este caso no es necesario ya que la configuracion la lleva esta clase.F

import modelo.entidad.Cliente;
import modelo.negocio.GestorCliente;
import modelo.persistencia.DaoCliente;
import modelo.vista.MainCliente;

public class ConfSpring {

	@Bean
	@Scope("prototype")

	public Cliente cliente() {
		Cliente c = new Cliente();
		return c;
	}

	@Bean
	public GestorCliente gestor(DaoCliente dao) {

		GestorCliente gc = new GestorCliente(dao);
		return gc;

	}
	/*Podria ser tambien asi
	 * 
	 * public GestorCliente gestor(DaoCliente dao) {
	 * GestorClientes gp = GestorClientes();
	 * gp.setGestorCliente(daoCliente);
	 * return daoCliente;
	 * 
	 * Hacer setter de este metodo.}
	 */

	@Bean
	public DaoCliente dao() {
		DaoCliente dc = new DaoCliente();
		return dc;
	}

	//Este no hace falta.
	@Bean
	public MainCliente vista() {
		MainCliente vista = new MainCliente();
		return vista;
	}
}
