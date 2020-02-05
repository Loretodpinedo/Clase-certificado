package curso.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import curso.modelo.entidad.Pc;
import curso.modelo.entidad.Pedido;
import curso.modelo.negocio.GestorPc;

@Controller
public class ControladorPc {

	@Autowired
	private GestorPc gPc;

	@Autowired
	private Pedido pedido;

	@Autowired
	private Pc pc;

	@RequestMapping("inicio")
	public String primeraPagina() {
		return "inicio";

	}

	@RequestMapping("formulario")
	public String paginaFormulario() {
		return "formulario";
	}

	@RequestMapping("final")
	public ModelAndView paginaFinal(@RequestParam("ram") String ram, @RequestParam("procesador") String procesador,
			@RequestParam("nombre") String nombreCliente, @RequestParam("direccion") String dirCliente,
			@RequestParam("email") String emailCliente, @RequestParam("comentarios") String comentarios,
			@RequestParam("componente") List<String> listaComponentes, ModelAndView mav) {

		pc.setRam(ram);
		pc.setProcesador(procesador);
		pc.setListaComponentes(listaComponentes);

		pedido.setNombreCliente(nombreCliente);
		pedido.setEmailCliente(emailCliente);
		pedido.setDirCliente(dirCliente);
		pedido.setComentarios(comentarios);
		pedido.setPc(pc);

		if (gPc.validar(pedido)) {

			mav.addObject("pedido", pedido);
			mav.setViewName("final");
			return mav;
		} else {
			mav.setViewName("formulario");
			return mav;
		}
	}

}
