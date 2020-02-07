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

	// loginRegistrado para el registro pasado por gestor correcto, entra por login
	// mensage con nombre usuario
	// loginError para el registro pasado por gestor no correcto, entra por login
	// mensage de error

	@Autowired
	private Usuario us;

	@Autowired
	private GestorUsuario gu;

	/*
	 * @RequestMapping("loginError") public String registroError() { return
	 * "loginError"; }
	 * 
	 * @RequestMapping("loginRegistrado") public String registradoCorrecto() {
	 * return "login"; }
	 */
	@RequestMapping("login")
	public String paginaLogin() {
		return "login";
	}
	
	@RequestMapping("inicio")
	public String paginaInicio() {
		return "inicio";
	}

	@RequestMapping("registrarse")
	public String paginaRegistro() {
		
	return "registrarse";
	}
	

	@RequestMapping("doRegistro")
	public ModelAndView paginaFinal(@RequestParam("usuario") String n, @RequestParam("email") String e,
			@RequestParam("password") String c, @RequestParam("telefono") String t, ModelAndView mav) {

		//Usuario us = new Usuario();
		us.setNombre(n);
		us.setContraseña(c);
		us.setEmail(e);
		us.setTelefono(t);
		
	 Usuario alta = gu.alta(us);
	 
	 if (alta != null){
		 
		 mav.addObject(us);
		 mav.addObject("hecho", "Usuario dado de alta");
		 mav.setViewName("redirect:login");
		 
	 }
			return mav;
		}				
		
		
		
		
		
	}
