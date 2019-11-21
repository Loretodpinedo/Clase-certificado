package TestBeans;

import Beans.Cliente;
import Beans.Pedido;

public class TestPedido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pedido ped1 = new Pedido(1, "Tornillo", 1, true, Cliente.dameCliente());
		Pedido ped2 = new Pedido(2, "Tuerca", 2, true, Cliente.dameCliente());
		

		System.out.print("Pedido: " + ped1.getIdPedido());
		System.out.print(" Descripcion: " + ped1.getDescripcion());
		System.out.println(" Cliente: " + ped1.getCliente().getNombre());
		
		
		System.out.print("Pedido: " + ped2.getIdPedido());
		System.out.print(" Descripcion: " + ped2.getDescripcion());
		System.out.println(" Cliente: " + ped2.getCliente().getNombre());
	}

}
