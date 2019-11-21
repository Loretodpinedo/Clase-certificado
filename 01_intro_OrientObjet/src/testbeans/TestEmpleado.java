package testbeans;
import beans.Empleado;

public class TestEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado emp1, emp2, emp3;//Se pueden crear los objetos asi.
		
		emp1 = new Empleado (); //o asi
		emp2 = new Empleado(12, "Maricarme", "After", "M", 600000, 56);//Creada con un constructor propio.
		emp3 = new Empleado(112, "Pedro", "Malaguilla");
		
		//asi se crean objetos cuando los atributos son privados
		
		emp1.setIdEmpleado(113);
		emp1.setNombre("Loreto");
		emp1.setApellidos("Diaz Pinedo");
		emp1.setEdad(43);
		emp1.setSalario(50000000);
		emp1.setSexo("M");
		
		
	/*	
		emp1.idEmpleado = 100;
		emp1.nombre = "Loreto";
		emp1.apellidos = "Diaz Pinedo";
		emp1.edad = 43;
		emp1.salario = 45000;
		emp1.sexo = "m";
		
		emp2.idEmpleado = 1;
		emp2.nombre = "JAVIER";
		emp2.apellidos = "Serrano Lopez";
		emp2.edad = 29;
		emp2.salario = 45000;
		emp2.sexo = "H";
		
		emp3.idEmpleado = 100;
		emp3.nombre = "Loreto";
		emp3.apellidos = "Diaz Pinedo";
		emp3.edad = 43;
		emp3.salario = 45000;
		emp3.sexo = "m";
	*/	
				//emp2 = emp3;
		/*		
		System.out.println("El id de empleado es " + emp1.idEmpleado);
		System.out.println("El nombre de empleada es " + emp1.nombre);
		System.out.println((emp1));
		
		System.out.println("\n");
		
		System.out.println("El id de empleado es " + emp2.idEmpleado);
		System.out.println("El nombre de empleada es " + emp2.nombre);
		System.out.println((emp2));
		
		System.out.println("\n");
		
		System.out.println("El id de empleado es " + emp3.idEmpleado);
		System.out.println("El nombre de empleada es " + emp3.nombre);
		System.out.println((emp3));
		*/
		System.out.println(emp1);
		System.out.println(emp2.getApellidos());
		System.out.println((emp3.getIdEmpleado() + " " + emp3.getNombre() + " " + emp3.getSexo()));
	}

}
