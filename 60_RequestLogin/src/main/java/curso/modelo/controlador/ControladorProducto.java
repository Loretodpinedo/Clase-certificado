package curso.modelo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import curso.modelo.entidad.Producto;

import curso.modelo.negocio.GestorProducto;

@Controller
public class ControladorProducto {

	@Autowired
	GestorProducto gp;

	@RequestMapping("inicio")

	public ModelAndView paginaAlta(ModelAndView mav) {

		List<Producto> lista = gp.listar();

		mav.addObject("lista", lista);
		mav.setViewName("inicio");

		return mav;
	}

	

}
