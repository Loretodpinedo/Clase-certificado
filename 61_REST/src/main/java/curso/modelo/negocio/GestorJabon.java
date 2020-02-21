package curso.modelo.negocio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curso.modelo.entidad.Jabon;
import curso.modelo.persistencia.JabonDao;

@Service
public class GestorJabon {

	@Autowired
	JabonDao jabonDao;
	@Autowired
	Jabon jabon;

	public List<Jabon> listar() {
		return jabonDao.findAll();
	}

	public Jabon buscarPorId(int id) {

		return jabonDao.findById(id);

	}


	public int validacionAlta(int id) {
		if (jabon.getIng1().isEmpty() && (jabon.getIng1().length() < 3)) {
			return 1;
		} else if (jabon.getIng2().isEmpty() && (jabon.getIng1().length() < 3)) {
			return 2;
		} else if (jabon.getIng3().isEmpty() && (jabon.getIng1().length() < 3)) {
			return 3;
		} else if (jabon.getNombre().isEmpty() && (jabon.getNombre().length() < 3)) {
			return 4;
		} else if (jabon.getPeso() <= 0) {
			return 5;
		} else {
			return 0;
		}

	}
}
