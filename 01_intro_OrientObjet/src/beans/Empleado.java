package beans;

public class Empleado {

	//se declaran privados y no se veran como modos en el objeto
		private int idEmpleado;
		private String nombre, apellidos, sexo;
		private double salario;
		private int edad;
		private Departamento departamento;
		
		
		
		
		
		//consturccion de metodo constructor. no hace falta poner que devuelve.
		
		/*public Empleado ( int idEmpleado, String nombre, String apellidos, String sexo, double salario, int edad) {
			
			this.idEmpleado = idEmpleado;
			
			}
		public Empleado (int idEmpleado, String nombre, String apellido) {
			
		}
		*/
	
		
		
		
		
		//creado automaticamente. 
		
		
		@Override
		public String toString() {
			
			return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", sexo="
					+ sexo + ", salario=" + salario + ", edad=" + edad + ", departamento=" + departamento + "]";
		}
		
		
		
		
		
		



		public Empleado(int idEmpleado, String nombre, String apellidos, String sexo, double salario, int edad,
				Departamento departamento) {
			super();
			this.idEmpleado = idEmpleado;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.sexo = sexo;
			this.salario = salario;
			this.edad = edad;
			this.departamento = departamento;
		}









		//Constructores creados automaticamente
		public Empleado(int idEmpleado, String nombre, String apellidos, String sexo, double salario, int edad) {
			super();//hace referencia al padre.
			this.idEmpleado = idEmpleado;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.sexo = sexo;
			this.salario = salario;
			this.edad = edad;
		}
		
		public Empleado(int idEmpleado, String nombre, String apellidos) {
			super();
			this.idEmpleado = idEmpleado;
			this.nombre = nombre;
			this.apellidos = apellidos;
			
			//constructor sin parametros
			
			
			
			}

//constructor vacio

		public Empleado() {
			super();
		}



	
		//getter and setter construidos automaticamente. this.seter  return.geter.

		public Departamento getDepartamento() {
			return departamento;
		}



		public void setDepartamento(Departamento departamento) {
			this.departamento = departamento;
		}

		public int getIdEmpleado() {
			return idEmpleado;
		}

		public void setIdEmpleado(int idEmpleado) {
			this.idEmpleado = idEmpleado;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}

		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}
		
		
		
		}
		
		



