package curso.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import curso.entidad.Jabon;


@Repository
public interface JabonDao extends JpaRepository<Jabon, Integer>{

	List<Jabon> findByNombreContainingIgnoreCase(String nombre);

	List<Jabon> findByAceite(String aceite);

	List<Jabon> findByAceite2ContainingIgnoreCase(String aceite2);

	List<Jabon> findByAceiteContainingIgnoreCaseAndAceite2ContainingIgnoreCase(String aceite, String aceite2);
	
	List<Jabon> findByAlcaliIgnoreCase(String alcali);
	
	List<Jabon> findByFacuosaIgnoreCase(String facuosa);
	



	
	
	

	
}
