package testbeans;

import beans.Departamento;
import beans.Empleado;

public class TestEmpleadoConDepartamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado emp1 = new Empleado(200, "Eva", "Perez", "m", 250000, 35, null);
		
		Departamento dep40 = new Departamento(40, "Formacion");
		Empleado emp2 = new Empleado(210, "Sara", "Ruiz", "m", 250000, 45, dep40);
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		/*mostrar por consola
		 * el nombre del empleado2, su salario y 
		 * el nombre del departamento del emp2
		 */
		
		System.out.println("Nombre del empleado 2 - Sara " + emp2.getNombre());
		System.out.println("Salario del empleado 2 - " + emp2.getSalario());
		System.out.println("El nombre del departamento del empleado 2 - Formacion " + emp2.getDepartamento().getNombre().toUpperCase());
		
	}

}
