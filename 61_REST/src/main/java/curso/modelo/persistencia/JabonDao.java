package curso.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import curso.modelo.entidad.Jabon;
@Repository
public interface JabonDao extends JpaRepository<Jabon, Integer> {

	public Jabon findById(int id);

}
