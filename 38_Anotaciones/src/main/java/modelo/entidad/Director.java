package modelo.entidad;

import org.springframework.stereotype.Component;

/*
 * se pueden dar de alta los beans por anotaciones hay 4 basicas:
 * 
 * @component da de alta la clase como bean en el contexto de spring
 * 
 * @Service Se usa para da de alta un objeto de tipo GESTOR.
 * 
 * @Repository Se usa para dar de alta un objeto de tipo DAO.
 * 
 * @Controller Se usa para dar de alta un objeto de tipo CONTROLADOR.
 * 
 * Las tres ultimas hacen lo mismo, son anotaciones semanticas, la distiencion es de
 * manera conceptual.
 */

@Component // con esta anotacion se da de alta automaticamente en el context.xml el bean
//con scope singleton
//con id=nombreDeClase en lowerCamelCase. 
//con este metodo solo se puede tener un objeto de esta clase.

//@Component(value = "directorPropio") de eta manera se cambia el id.

//@Component 
//@Scope("prototype")de esta manera se cambia el scope a scope

public class Director {

	private String nombDir = "Jarry el Sucio", edad = "";

	@Override
	public String toString() {
		return nombDir + ", edad " + edad;
	}

	public Director() {
		super();
	}

	public Director(String nombDir, String edad) {
		super();
		this.nombDir = nombDir;
		this.edad = edad;
	}

	public String getNombDir() {
		return nombDir;
	}

	public void setNombDir(String nombDir) {
		this.nombDir = nombDir;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

}
