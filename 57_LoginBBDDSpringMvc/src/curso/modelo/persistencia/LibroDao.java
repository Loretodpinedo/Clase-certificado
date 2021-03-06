package curso.modelo.persistencia;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import curso.modelo.entidad.Libro;

@Repository
public interface LibroDao extends JpaRepository<Libro, Integer>{
	
	public Libro findByTitulo (String titulo);
	

}
