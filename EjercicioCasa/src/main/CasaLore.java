package main;

import java.util.ArrayList;

import bean.Casa;
import bean.Direccion;
import bean.Habitacion;
import bean.Persona;

public class CasaLore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Habitacion salon = new Habitacion();
		salon.setM2(50);
		salon.setTipo("salon");
		Habitacion cocina = new Habitacion();
		cocina.setM2(40);
		cocina.setTipo("cocina");
		Habitacion ba�o = new Habitacion();
		ba�o.setM2(30);
		ba�o.setTipo("ba�o");
		Habitacion dormitorio = new Habitacion();
		dormitorio.setM2(30);
		dormitorio.setTipo("dormitorio");
		
		ArrayList<Habitacion>listaHabitacion = new ArrayList<Habitacion>();
		listaHabitacion.add(dormitorio);
		listaHabitacion.add(ba�o);
		listaHabitacion.add(cocina);
		listaHabitacion.add(dormitorio);
		listaHabitacion.add(salon);
		
		Direccion casalquiler = new Direccion ();
		casalquiler.setTipoVia("Calle");
		casalquiler.setNombreVia("Rua Bella");
		casalquiler.setCiudad("Madrid");
		casalquiler.setCp("28047");
		
		Direccion casaprop = new Direccion ();
		casaprop.setTipoVia("Paseo");
		casaprop.setNombreVia("De gracia");
		casaprop.setCiudad("Barna");
		casaprop.setCp("29025");
		
		Persona propietario = new Persona ();
		propietario.setDireccion(casaprop);
		propietario.setEdad(43);
		propietario.setNombre("Loreto");
		propietario.setPeso(60);

		Casa maravilla = new Casa ();
		maravilla.setDireccion(casalquiler);
		maravilla.setPrecio(900);
		maravilla.setPropietario(propietario);
		maravilla.setListaHabitacion(listaHabitacion);
		
		System.out.println("La casa que has alquilado esta en la "+maravilla.getDireccion());
		System.out.println("El precio del alquiler es "+maravilla.getPrecio()+"�");
		System.out.println("El propietario de la casa "+maravilla.getPropietario());
		//System.out.println("La casa tiene la siguientes habitaciones "+maravilla.getListaHabitacion());
		System.out.println("La casa consta de las siguientes habitaciones:");
		for (Habitacion ele: listaHabitacion) {
			System.out.println(" -Habitacion de tipo "+ele.getTipo()+ " con "+ ele.getM2()+ "m2.");
		}
	}
	

}

