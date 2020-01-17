package cfg;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
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

	@Bean
	public DaoCliente dao() {
		DaoCliente dc = new DaoCliente();
		return dc;
	}

	@Bean
	public MainCliente vista() {
		MainCliente vista = new MainCliente();
		return vista;
	}
}
