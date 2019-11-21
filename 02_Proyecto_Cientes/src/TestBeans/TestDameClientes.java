package TestBeans;

import Beans.Cliente;

public class TestDameClientes {

	public static void main(String[] args) {
	
		//Cliente cli1 = new Cliente();//Lo creo para invocar a la clase
		//Cliente miCliente = cli1.dameCliente();
		
		Cliente otroCliente = Cliente.dameCliente();//no nocesita new cliente porque el metodo es estatico.
		Cliente [] mis = Cliente.dameClientes();
		
		for (Cliente ele: mis)
			System.out.println(ele.getNombre());
		
		for (int i=0; i< mis.length; i++)
			System.out.println(mis[i]);
		
		//System.out.println("cli1 " + cli1);
		//System.out.println("miCliente " + miCliente );
		//System.out.println("otro Cliente " + otroCliente);
		//System.out.println("mis " + mis);
		
		
		
		
		}

	
	

	}

