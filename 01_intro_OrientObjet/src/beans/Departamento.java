package beans;

public class Departamento {

	
		
		private int idDepartamento = 0;
		private String nombre = "";
		private Empleado jefe;//Creacion de atributo tipo 
		
			
		
		
		
		public Empleado getJefe() {
			return jefe;
		}

		public void setJefe(Empleado jefe) {
			this.jefe = jefe;
		}

		public Departamento(int idDepartamento, String nombre, Empleado jefe) {
			super();
			this.idDepartamento = idDepartamento;
			this.nombre = nombre;
			this.jefe = jefe;
		}

		@Override
		public String toString() {
			if (jefe == null)
			return "Departamento [idDepartamento=" + idDepartamento + ", nombre=" + nombre + ", jefe=" + jefe + "]";
			
			else 
				return "Departamento [idDepartamento=" + idDepartamento + ", nombre=" + nombre + ", jefe=" + jefe.getIdEmpleado() + "]";
			
			//Para evitar que se bucle en una llamada de syso el if utiliza el toString si el campo es nulo y utiliza el metodo getIdEmpleado si
			//el campo no es nulo.
		}

		public Departamento(int idDepartamento, String nombre) {
			super();
			this.idDepartamento = idDepartamento;
			this.nombre = nombre;
			
			
			
		}

		public Departamento() {
			super();
		}

		public int getIdDepartamento() {
			return idDepartamento;
		}

		public void setIdDepartamento(int idDepartamento) {
			this.idDepartamento = idDepartamento;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		
		 
		
	}

