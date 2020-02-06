package curso.controlador;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

import curso.modelo.entidad.Usuario;
import curso.modelo.negocio.gestorUsuario;

@Controller
public class ControladorLoguin {

	@Autowired
	private gestorUsuario gu;

	@Autowired
	private Usuario us;

	@RequestMapping("loguin")
	public String paginaLoguin() {
		return "loguin";
	}

	@RequestMapping("datos")
	public String paginaDatos() {
		return "datos";
	}

	@RequestMapping("registro")
	public String paginaRegistro() {
		return "registro";
	}

	@RequestMapping("final")
	public ModelAndView paginaFinal(ModelAndView mav, HttpServletRequest request) {

		us.setNombre(request.getParameter("nombre"));
		us.setDireccion(request.getParameter("direccion"));
		us.setEdad(request.getParameter("edad"));
		us.setContraseña(request.getParameter("contraseña"));
		us.setHobbies(request.getParameter("hobbies"));

		if (gu.logado(us)) {
			
			mav.addObject("usuario", us);
			mav.setViewName("datos");
		}
		return mav;

	}

}
