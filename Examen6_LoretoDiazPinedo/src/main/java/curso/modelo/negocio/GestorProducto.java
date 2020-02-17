package curso.modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import curso.modelo.entidad.Producto;
import curso.modelo.persistencia.ProductoDao;

@Service
public class GestorProducto {

	@Autowired
	private ProductoDao pd;

	@Transactional
	public int validacionAlta(Producto p) {
		if (p.getCategoria().isEmpty()) {

			return 1;
		}
		if (p.getNombre().isEmpty()) {

			return 2;
		}
		if (p.getPrecio() == 0.0) {
			return 3;
		} else {
			pd.save(p);
			return 4;
		}
	}

	public List<Producto> listar() {
		return pd.findAll();
	}

}
