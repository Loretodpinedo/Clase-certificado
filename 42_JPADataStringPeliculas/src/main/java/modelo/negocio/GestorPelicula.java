package modelo.negocio;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelo.entidad.Pelicula;
import modelo.persistencia.PeliculaDao;

@Service
public class GestorPelicula {

	@Autowired
	private PeliculaDao peliculaDao;

	@Transactional
	public Pelicula alta(Pelicula p) {
		// Si no pasamos un id creara uno nuevo.
		return peliculaDao.save(p);
	}

	@Transactional
	public Pelicula modificar(Pelicula p) {
		// si le pasamos id salvara los datos nuevos en el id que le hemos dado.
		return peliculaDao.save(p);
	}

	public Pelicula obtener(int id) {
		return peliculaDao.findById(id).get();

	}

	public List<Pelicula> listar() {
		return peliculaDao.findAll();

	}

	@Transactional
	public void borrar(int id) {
		peliculaDao.deleteById(id);
	}

}
