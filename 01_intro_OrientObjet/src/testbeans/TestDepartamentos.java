package testbeans;

import java.util.Scanner;

import beans.Departamento;

public class TestDepartamentos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creamos los objetos
		
		Scanner sc = new Scanner(System.in);
		Departamento dep1,dep2,dep3;
		
		//Añadimos los constructores
		dep1 = new Departamento(10, "ventas");
		dep2 = new Departamento();
		dep3 = new Departamento();
				
		 //metemos contenido 
		dep2.setIdDepartamento(20);
		dep2.setNombre("Administracion");
		
		System.out.println("Dame numero de departamento ");
		
		//dep3 incluira id de departamento metido por consola.
		//dep3.setIdDepartamento(sc.nextInt());
		
		
		dep3.setIdDepartamento(Integer.parseInt(sc.next()));//Para forzar que una varriable string reciva una var int.
		System.out.println("Dime el nombre del departamento ");
		dep3.setNombre(sc.next());
	
		
		System.out.println("Datos de los departamentos");
		System.out.println(dep1);
		System.out.println(dep2);
		System.out.println(dep3);
		System.out.println("Datos sueltos");
		System.out.println("id dep1 " + dep1.getIdDepartamento());
		System.out.println("Nombre dep2 " + dep2.getNombre());
		
		
	sc.close();	
	
	}

}
