package curso.modelo.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import curso.modelo.entidad.Libro;
import curso.modelo.persistencia.LibroDao;

@Service
public class GestorLibro {
	
	@Autowired
	private LibroDao libroDao;
	
	@Transactional
	public Libro alta (Libro l) {
		
		return libroDao.save(l);
	}
	

}
