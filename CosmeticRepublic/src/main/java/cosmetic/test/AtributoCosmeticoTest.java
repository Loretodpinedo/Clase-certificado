package cosmetic.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cosmetic.CosmeticRepublicApplication;
import cosmetic.modelo.entidad.AtributoCosmetico;
import cosmetic.modelo.entidad.CategoriaAtributo;
import cosmetic.modelo.persistencia.AtributoCosmeticoDao;

public class AtributoCosmeticoTest {

	static AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CosmeticRepublicApplication.class);
	
	public static void main(String[] args) {
		
		AtributoCosmeticoDao dao = context.getBean("atributoCosmeticoDao", AtributoCosmeticoDao.class);
		
		AtributoCosmetico atributoCosmetico = context.getBean("atributoCosmetico", AtributoCosmetico.class);
		
		System.out.println("Creando atributo cosmetico");
		
		atributoCosmetico.setNombre("prueba dao");
		atributoCosmetico.setCategoriaAtributo(CategoriaAtributo.PropiedadCosmetica);
		System.out.println("Creado atributo cosmetico " + atributoCosmetico);
		dao.save(atributoCosmetico);
		System.out.println("Guardado atributo cosmetico ");
		
		System.out.println("Mostrando atributos cosmeticos " + dao.findAll());
		
		

	}

}
