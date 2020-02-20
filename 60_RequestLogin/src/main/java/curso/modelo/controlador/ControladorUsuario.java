package curso.modelo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import curso.modelo.entidad.Usuario;
import curso.modelo.negocio.GestorUsuario;

@Controller
public class ControladorUsuario {
		
	@Autowired
	private Usuario us;

	@Autowired 
	private GestorUsuario gu;
	
	
		
	@RequestMapping("doLogin")
	public ModelAndView paginaLogin(@RequestParam ("nombre")String nombre, 
			@RequestParam ("pass") String pass,
			ModelAndView mav) {
		
		
		us.setNombreU(nombre);
		us.setPass(pass);
		
		boolean registrado = gu.registrado(us);
		
		if (registrado) {
			us.setRegistrado(true);
			//redirect siempre busca un controlador @RequestMapping
			mav.setViewName("redirect:listaProducto");	
		}else {
			
			mav.setViewName("redirect:login");
		}
		
		return mav;
	}
	

	@RequestMapping("login")
		public String paginaDeInicio() {
		
		return "login";
	}
	
	@RequestMapping("compra")
	public String detalleCompra() {
	
	return "compra";
}
	
	
	}
	
	


