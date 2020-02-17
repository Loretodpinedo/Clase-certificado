package curso.modelo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import curso.modelo.entidad.Producto;
import curso.modelo.negocio.GestorProducto;

@Controller
public class controladorProducto {

	@Autowired
	private GestorProducto gp;
	

	@RequestMapping("productos")

	public ModelAndView paginaAlta(ModelAndView mav) {
		List<Producto> lista = gp.listar();

		mav.addObject("lista", lista);
		mav.setViewName("productos");

		return mav;
	}

	@RequestMapping("doAlta")
	public ModelAndView darAlta(@RequestParam("categoria") String categoria, @RequestParam("nombre") String nombre,
			@RequestParam("precio") Double precio, ModelAndView mav) {


		boolean error = false;
		
		Producto p = new Producto();

		p.setCategoria(categoria);
		p.setNombre(nombre);
		p.setPrecio(precio);

		int validacion = gp.validacionAlta(p);

		if (validacion == 1) {

			mav.getModelMap().addAttribute("errorCategoria", "Falta la categoria");
			error = true;
		}
		if (validacion == 2) {

			mav.getModelMap().addAttribute("errorNombre", "Falta el nombre");
			error = true;
		}
		if (validacion == 3) {

			mav.getModelMap().addAttribute("errorPrecio", "Falta el precio");
			error = true;
		}
		if (error) {

			return mav;
		}
		



		mav.addObject(p);
		//Siempre que se modifique la bbdd se hace un redirec
		mav.setViewName("redirect:productos");
		
		mav.getModelMap().addAttribute("mensaje", "Producto se ha dado de alta");
	

		return mav;
	}

	
}
