package modelo.persistencia;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import modelo.entidad.Libro;

@Repository
public interface LibroDao extends JpaRepository<Libro, Integer> {

	public List<Libro> findByTituloContainingIgnoreCase(String titulo);

	public List<Libro> findByIsbn(String isbn);

	public List<Libro> findByEditorialContainingIgnoreCase(String editorial);

	public List<Libro> findByTituloContainingIgnoreCaseAndEditorialContainingIgnoreCase(String titulo , String editorial);

}
