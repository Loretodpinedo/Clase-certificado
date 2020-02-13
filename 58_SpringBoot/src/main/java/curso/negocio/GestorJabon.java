package curso.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import curso.entidad.Jabon;
import curso.persistencia.JabonDao;



@Service
public class GestorJabon {
	
	@Autowired
	private JabonDao jabonDao;

	@Transactional
	public Jabon alta(Jabon j) {

		return jabonDao.save(j);
	}

	@Transactional
	public void borrarId(int id) {

		jabonDao.deleteById(id);
	}

	@Transactional
	public Jabon modificar(Jabon j) {
		// si le pasamos id salvara los datos nuevos en el id que le hemos dado.
		return jabonDao.save(j);
	}

	public Jabon obtener(int id) {
		return jabonDao.findById(id).get();

	}

	public List<Jabon> listar() {
		return jabonDao.findAll();

	}

	public List<Jabon> buscarPorNomJabon(String nombre) {

		return jabonDao.findByNombreContainingIgnoreCase(nombre);
	}

	public List<Jabon> buscarAceite(String aceite) {

		return jabonDao.findByAceite(aceite);
	}

	public List<Jabon> buscarPorAceite2(String aceite2) {

		return jabonDao.findByAceite2ContainingIgnoreCase(aceite2);
	}

	public List<Jabon> buscarPorAceiteyAceite2(String aceite, String aceite2) {

		return jabonDao.findByAceiteContainingIgnoreCaseAndAceite2ContainingIgnoreCase(aceite, aceite2);
	}
	
	public List<Jabon> buscarPorAlcali(String alcali){
		
		return jabonDao.findByAlcaliIgnoreCase(alcali);
	}
	
	public List<Jabon> buscarPorFaseAcuosa(String facuosa){
		
		return jabonDao.findByFacuosaIgnoreCase(facuosa);
	}

}
