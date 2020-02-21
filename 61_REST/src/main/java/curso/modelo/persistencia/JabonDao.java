package curso.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import curso.modelo.entidad.Jabon;

public interface JabonDao extends JpaRepository<Jabon, Integer> {

	public Jabon findById(int id);

}
