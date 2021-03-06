package cosmetic.modelo.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cosmetic.modelo.entidad.AtributoCosmetico;

public interface AtributoCosmeticoDao extends JpaRepository<AtributoCosmetico, Integer>{
	
	List<AtributoCosmetico>findByNombreContainingIgnoreCase(String nombre);
	List<AtributoCosmetico>findById(int id);

}
