package curso.modelo.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import curso.modelo.entidad.Usuario;


@Repository
public interface UsuarioDao extends JpaRepository<Usuario, Integer> {
	 

 }

