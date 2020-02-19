package curso.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import curso.modelo.entidad.Producto;

public interface ProductoDao extends JpaRepository<Producto, Integer>{
	
			public Producto findById (int id);

}
