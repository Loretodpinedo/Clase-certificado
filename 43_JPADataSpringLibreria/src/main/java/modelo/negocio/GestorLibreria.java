package modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import modelo.entidad.Libro;

import modelo.persistencia.LibroDao;

@Service
public class GestorLibreria {

	@Autowired
	private LibroDao libroDao;

	@Transactional
	public Libro alta(Libro l) {

		return libroDao.save(l);
	}

	@Transactional
	public void borrarId(int id) {

		libroDao.deleteById(id);
	}

	@Transactional
	public Libro modificar(Libro l) {
		// si le pasamos id salvara los datos nuevos en el id que le hemos dado.
		return libroDao.save(l);
	}

	public Libro obtener(int id) {
		return libroDao.findById(id).get();

	}

	public List<Libro> listar() {
		return libroDao.findAll();

	}

	public List<Libro> buscarPorTitulo(String titulo) {

		return libroDao.findByTituloContainingIgnoreCase(titulo);
	}

	public List<Libro> buscarIsbin(String isbn) {

		return libroDao.findByIsbn(isbn);
	}

	public List<Libro> buscarPorEditorial(String editorial) {

		return libroDao.findByEditorialContainingIgnoreCase(editorial);
	}

	public List<Libro> buscarPorTituloYEditorial(String titulo, String editorial) {

		return libroDao.findByTituloContainingIgnoreCaseAndEditorialContainingIgnoreCase(titulo, editorial);
	}
}
