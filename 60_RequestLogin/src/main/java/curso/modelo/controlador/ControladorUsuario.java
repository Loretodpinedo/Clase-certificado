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
	
	public ModelAndView login(@RequestParam ("nombre") String  nombre, @RequestParam ("pas") String pass, ModelAndView mav) {
		
		Usuario us = new Usuario();
		
		us.setNombreU(nombre);
		us.setPass(pass);
		
		gu.alta(us);
		
		mav.addObject(us);
		mav.addObject("hecho", "Usuario dado de alta");
		mav.setViewName("redirect:login");
		
		return mav;
	}

	
	@RequestMapping("login")
	public ModelAndView paginaLogin(@RequestParam ("nombre")String nombre, @RequestParam ("pass") String pass, @RequestParam ModelAndView mav) {
		
		us.setNombreU(nombre);
		us.setPass(pass);
		
		boolean registrado = gu.registrado(us);
		
		if (registrado) {
			
			mav.setViewName("redirect:inicio");	
		}else {
			
			mav.setViewName("redirect:login");
		}
		
		return mav;
	}
	
	
	@RequestMapping("inicio")
		public String paginaDeInicio() {
		
		return "inicio";
	}
	
	@RequestMapping("compra")
	public String detalleCompra() {
	
	return "compra";
}
	
	
	}
	
	


