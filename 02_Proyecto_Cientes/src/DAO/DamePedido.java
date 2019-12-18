package DAO;

import Beans.Cliente;
import Beans.Pedido;

public class DamePedido {

		
		public static Pedido damePedido () {
			
			return new Pedido(55, "Aceite de coco", 1.9, true, Cliente.dameCliente());
			
			}
		
		public static Pedido [] damePedidos; {
			Pedido [] pedidos = {
					
				new Pedido(2, "aceite de coco", 5, true, Cliente.dameCliente()),
				new Pedido(3, "Tegobetaina de coco", 6.9, true, Cliente.dameCliente()),
				//new Pedido(idPedido, descripcion, importe, conIva, cliente)
				
			
			};
		}
		
		}


