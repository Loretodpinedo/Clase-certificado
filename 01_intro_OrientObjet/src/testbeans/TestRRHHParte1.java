package testbeans;

	import beans.Departamento;
	import beans.Empleado;

	public class TestRRHHParte1 {

		public static void main(String[] args) {
			
			Departamento dep1 = null;
			dep1 = findById(30);
			
			
			System.out.println(dep1);//puede buclarse por los stream, ver si tiene referencias cruzadas y quitar una de las dos.
			
		}

	public static Departamento findById(int id) {
		if (id != 30)
			return null;
		
		
		Departamento dep30 = new Departamento(30, "ventas");//poniendo Dep ctr + esp se crea beans.Departamento igual para Empleado.
		Empleado emp114, emp115, emp116, emp300;
		
		emp114 = new Empleado(114, "Diego", "Martinez", "H", 350000, 45, dep30);
		emp115 = new Empleado(115, "Sara", "Perez", "M", 20_000, 35, dep30);
		emp116 = new Empleado(116, "Carlos", "Sanchez", "H", 15_000, 20, dep30);
		emp300 = new Empleado(300, "Natalia", "Vazquez", "M", 70_000, 27, dep30);
		
		dep30.setJefe(emp114);
		
		return dep30;
	}
	
	
	
		public static void loDeArriba () {	
			
			Departamento dep30 = new Departamento(30, "ventas");//poniendo Dep ctr + esp se crea beans.Departamento igual para Empleado.
			Empleado emp114, emp115, emp116, emp300;
			
			emp114 = new Empleado(114, "Diego", "Martinez", "H", 350000, 45, dep30);
			emp115 = new Empleado(115, "Sara", "Perez", "M", 20_000, 35, dep30);
			emp116 = new Empleado(116, "Carlos", "Sanchez", "H", 15_000, 20, dep30);
			emp300 = new Empleado(300, "Natalia", "Vazquez", "M", 70_000, 27, dep30);
			
			dep30.setJefe(emp114);//con esto el empleado 114 del departamento 30 pertenece a la clase Jefe.
			
			//Creo el departamento 120 y la empleado Carmen asignacion de jefe que pertenece a otro departamento 
			//puedo usar el constructor de empleado en la variable que apunta a la clase empleado. 
			Departamento dep120 = new Departamento(120, "Formacion", new Empleado(225, "Carmen", "Gonzalez", "M", 70_000, 43, dep30) );
		
			Departamento dep130 = new Departamento(130, "Logistica", emp300);
			
			//hago pertenecer a jefe al departamento 120.
			dep120.getJefe().setDepartamento(dep120);
			
			emp300.setDepartamento(dep130);
			
			System.out.println("dep 120 " + dep120.getJefe().getDepartamento().getNombre());
			System.out.println("dep 130 " + dep130.getJefe().getDepartamento().getNombre());//Cual es el nombre del jefe del dep 130.
			
			
			

		}

	}
