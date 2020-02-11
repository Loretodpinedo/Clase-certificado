package curso.modelo.negocio;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import curso.modelo.entidad.Libro;
import curso.modelo.persistencia.LibroDao;

@Service
public class GestorLibro {
	
	@Autowired
	private LibroDao libroDao;
	
	private List<Libro> listaLibros;
	
	@Transactional
	public Libro altaLibro (Libro l) {
		
		return libroDao.save(l);
	}
	
	public List<Libro> lista(){
		
		return libroDao.findAll();
		
		
		
	}
	
	public Libro detalle(String titulo){
		return libroDao.findByTitulo(titulo);
		
	}
	
	
	

}
