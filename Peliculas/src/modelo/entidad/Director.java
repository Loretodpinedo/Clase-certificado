package modelo.entidad;

public class Director {
	
	private String nombDir = "", edad = "";
	
	
	
				
		
	

	@Override
	public String toString() {
		return  nombDir + ", edad " + edad;
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
