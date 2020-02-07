package curso.modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import curso.modelo.entidad.Usuario;
import curso.modelo.persistencia.UsuarioDao;

@Service
public class GestorUsuario {

	// Metodo para logarse con todos los campos rellenos.

	@Autowired
	private UsuarioDao usuarioDao;

	// Metodo para registrarse con todos los campos rellenos y validos
	@Transactional
	public Usuario alta(Usuario u) {

		/*
		 * if (!u.getNombre().isEmpty() && !u.getContraseña().isEmpty() &&
		 * !u.getEmail().isEmpty() && !u.getTelefono().isEmpty()) {
		 * 
		 * return u; }
		 */
		return usuarioDao.save(u);
	}

	public Usuario buscarPorId(int id) {

		return usuarioDao.findById(id).get();
	}

}
