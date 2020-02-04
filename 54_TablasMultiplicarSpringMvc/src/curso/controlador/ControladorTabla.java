package curso.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Esta anotacion hace que controle
@Controller
public class ControladorTabla {

	// mediante esta anotacion le estamos diciendo al
	// super servlet de spring que las peticiones con url
	// "tabla" entren por este metodo. Al no decirle el verbo
	// http, mapea todos los verbos http
	// OJO!!! hay que pasar por el super servlet por lo tanto
	// esta url realmente es : "/mvc/tablamultiplicar"

	@RequestMapping("tabla")

	public String tablamultipicacion() {

		return "tablaMultiplicar";

	}

	@RequestMapping("tabla2")

	public String tabla2() {

		return "segundaTabla";

	}
	
	

}
