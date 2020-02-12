package curso.modelo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import curso.modelo.entidad.Libro;
import curso.modelo.negocio.GestorLibro;

@Controller
public class ControladorLibro {

	@Autowired
	private Libro li;

	@Autowired
	private GestorLibro gl;

	@RequestMapping("alta")
	public String paguinaAlta() {
		return "alta";
	}

	@RequestMapping("doAlta")
	public ModelAndView altaLibro(@RequestParam("titulo") String titulo, @RequestParam("anio") int anio,
			@RequestParam("autor") String autor, @RequestParam("editorial") String editorial,
			 ModelAndView mav) {
		
		li.setTitulo(titulo);
		li.setAñioPublicacion(anio);
		li.setAutor(autor);
		li.setEditorial(editorial);
	

		Libro altaLibro = gl.altaLibro(li);
		
		mav.addObject(li);
		mav.setViewName("redirect:alta?mensaje=El libro se ha dado de alta");
		return mav;
	}

	@RequestMapping("listado")
	public ModelAndView listadoLibros(ModelAndView mav) {
		
		List <Libro> listaLibros = gl.lista();
		mav.addObject("listaLibros",listaLibros);
		mav.setViewName("listado");
		return mav;
	}
	@RequestMapping("detallePorLibro")
	
	public ModelAndView detalleDeLibro(@RequestParam("titulo") String titulo, ModelAndView mav) {
		Libro lib = gl.detalle(titulo);

		
		mav.addObject("libro", lib);
		mav.setViewName("detalle");
		return mav;
	}

}
