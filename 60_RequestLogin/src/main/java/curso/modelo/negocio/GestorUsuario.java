package curso.modelo.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import curso.modelo.entidad.Usuario;
import curso.modelo.persistencia.UsuarioDao;

@Service
public class GestorUsuario {
	
	@Autowired
	private UsuarioDao usDao;
	
	@Transactional
	public Usuario alta(Usuario u) {
		
		return usDao.save(u);
	}
	
	public boolean registrado(Usuario us) {

		// Cuidado con el orden!!!!!! han de coincicidir

		if (usDao.findByNombreUAndPass(us.getNombreU(), us.getPass()) == null) {

			return false;
		} else {
			return true;
		}

	}
	
	

}
