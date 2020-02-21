package curso.modelo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import curso.modelo.entidad.Jabones;
import curso.modelo.negocio.GestorJabon;

@RestController
public class ControladorJabon {

	@Autowired
	private GestorJabon gestorJabon;

	@GetMapping(path = "jabones", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })

	public ResponseEntity<Jabones> listar() {
		List<Jabon> lista = gestorJabon.listar();
		Jabones listaJabon = new Jabones();
		peliculas.setListaPelicula(lista);
		return new ResponseEntity<Peliculas>(peliculas, HttpStatus.OK);
	}
}
