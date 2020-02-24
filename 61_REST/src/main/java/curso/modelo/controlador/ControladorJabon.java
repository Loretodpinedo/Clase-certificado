package curso.modelo.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import curso.modelo.entidad.Jabon;
import curso.modelo.entidad.Jabones;
import curso.modelo.negocio.GestorJabon;

@RestController
public class ControladorJabon {

	@Autowired
	private GestorJabon gestorJabon;

	@GetMapping(path = "jabones", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })

	public ResponseEntity<Jabones> listar() {
		List<Jabon> lista = gestorJabon.listar();
	Jabones jabones = new Jabones();
	jabones.setListaJabon(lista);
	return new ResponseEntity<Jabones>(jabones, HttpStatus.OK);
	}
	
	@PostMapping(path = "jabones", consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	
	public ResponseEntity<Jabon> alta(@RequestBody Jabon jabon){
		gestorJabon.alta(jabon);//actualiza el id
		return new ResponseEntity<Jabon>(jabon,HttpStatus.CREATED);
	}
	
	@GetMapping(path ="jabones/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Jabon> obtener(@PathVariable("id") Integer id){
		Optional<Jabon> opt = gestorJabon.buscarPorId(id);
		if(opt.isPresent()) {
			return new ResponseEntity<Jabon>(opt.get(),HttpStatus.OK);
		}else {
			return new ResponseEntity<Jabon>(HttpStatus.NOT_FOUND);
	
		}
		}
	@PutMapping(path="jabones/{id}", consumes =  MediaType.APPLICATION_JSON_VALUE,
			produces =  MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Jabon> modificar(@RequestBody Jabon jabon,
					@PathVariable Integer id){
		Optional<Jabon> opt = gestorJabon.buscarPorId(id);
		if(opt.isPresent()) {
			jabon.setId(id);
			gestorJabon.alta(jabon);
			return new ResponseEntity<Jabon>(jabon,HttpStatus.OK);
		}else {
			jabon.setId(id);
			return new ResponseEntity<Jabon>(jabon,HttpStatus.NOT_FOUND);
		}	
		
	}
	@DeleteMapping(path="jabones/{id}")
	public ResponseEntity<Jabon> borrar(@PathVariable Integer id){
		Optional<Jabon> opt = gestorJabon.buscarPorId(id);
		if(opt.isPresent()) {
			gestorJabon.borrar(id);
			return new ResponseEntity<Jabon>(opt.get(),HttpStatus.OK);
		}else {
			return new ResponseEntity<Jabon>(HttpStatus.NOT_FOUND);
		}	
	}
	
}
