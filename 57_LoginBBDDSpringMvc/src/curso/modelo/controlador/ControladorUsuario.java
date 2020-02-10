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

		// Usuario us = new Usuario();
		us.setNombre(n);
		us.setContraseña(c);
		us.setEmail(e);
		us.setTelefono(t);

		Usuario alta = gu.alta(us);

		if (alta != null) {

			mav.addObject(us);
			mav.addObject("hecho", "Usuario dado de alta");
			mav.setViewName("redirect:login");

		}
		return mav;
	}

	@RequestMapping("validacion")
	public ModelAndView validado(@RequestParam("usuario") String nombre, @RequestParam("password") String contraseña,
			ModelAndView mav) {

		us.setNombre(nombre);
		us.setContraseña(contraseña);

		boolean validado = gu.registrado(us);

		if (validado) {

			mav.getModelMap().addAttribute("nombre", us.getNombre());
			mav.getModelMap().addAttribute("contraseña", us.getContraseña());

			mav.setViewName("redirect:inicio");
		} else {

			mav.addObject("error", "Este usuario no esta registrado");
			mav.setViewName("redirect:login");
		}
		return mav;
	}

}
