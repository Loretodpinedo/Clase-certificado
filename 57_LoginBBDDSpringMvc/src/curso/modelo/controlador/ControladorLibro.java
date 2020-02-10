package curso.modelo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import curso.modelo.entidad.Libro;
import curso.modelo.negocio.GestorLibro;

@Controller
public class ControladorLibro {
	
	@Autowired
	private Libro li;
	
	@Autowired
	private GestorLibro gl;
	
	@RequestMapping("doAlta")
	public String altaLibro() {
		return "alta";
	}
	
	@RequestMapping("listado")
	public String listadoLibros() {
		return "listado";
	}

}
