package curso.modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import curso.modelo.entidad.Producto;
import curso.modelo.persistencia.ProductoDao;

@Service
public class GestorProducto {
	
	@Autowired
	private ProductoDao prDao;
	
		
	public List<Producto> listar() {
		return prDao.findAll();
	}
	
	public Producto buscarPorId(int id) {
		
		return prDao.findById(id);
		
	}
	


}
