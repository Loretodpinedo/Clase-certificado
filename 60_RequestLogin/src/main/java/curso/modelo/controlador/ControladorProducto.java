package curso.modelo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import curso.modelo.entidad.Producto;
import curso.modelo.entidad.Usuario;
import curso.modelo.negocio.GestorProducto;

@Controller
public class ControladorProducto {

	@Autowired
	GestorProducto gp;

	@Autowired
	Usuario us;

	// @Autowired
	// Producto pr;

	@RequestMapping("listaProducto")
	public ModelAndView paginaAlta(ModelAndView mav) {

		if (us.isRegistrado()) {
			List<Producto> lista = gp.listar();

			mav.addObject("lista", lista);
			mav.setViewName("inicio");
		} else {
			mav.setViewName("redirect:login");
		}

		return mav;
	}

	@RequestMapping("doPedido")

	public ModelAndView listaPedido(@RequestParam(required = false) Integer id,
			@RequestParam(required = false) List<Producto> listaPedido, ModelAndView mav) {

		Producto pr = gp.buscarPorId(id);

		listaPedido.add(pr);

		mav.getModelMap().addAttribute("nombre", pr.getNombre());
		mav.getModelMap().addAttribute("precio", pr.getPrecio());
		mav.addObject("listaPedido", listaPedido);
		mav.setViewName("inicio");

		return mav;
	}

}
