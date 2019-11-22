package main;

import java.util.ArrayList;

import bean.Alumno;
import bean.Certificado;
import bean.Profesor;

public class TestCertificado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Doy valor a los atributos de profesor.
		Profesor profe = new Profesor();
		profe.setNombre("Tomasin");
		profe.setDni("54007809X");
		profe.setSexo("H");
		profe.setEdad(56);
		profe.setSalario(50900.600);
		
		Profesor prof = new Profesor();
		prof.setNombre("Felix");
		prof.setDni("654981564R");
		prof.setSexo("H");
		prof.setEdad(41);
		prof.setSalario(80900.60);

		// Doy valos a los atributos del certificado.
		Certificado curso = new Certificado();
		curso.setNombreCurso("Java");
		curso.setIdCurso("1519F");
		curso.setHoras(600.45);
		curso.setPrecio(6000.50);
		
		Certificado curso2 = new Certificado();
		curso2.setNombreCurso("Matematicas");
		curso2.setIdCurso("1564684p");
		curso2.setHoras(1500.0);
		curso2.setPrecio(12000.25);

		// Doy valor a los atributos del alumno usando los setter.
		Alumno alu1 = new Alumno();
		alu1.setNombreCompleto("Loreto Diaz Pinedo");
		alu1.setDni("65897412C");
		alu1.setSexo("M");
		alu1.setEdad(43);
		

		// Doy valor a los atributos del segundo alumno usando el constructor.

		Alumno alu2 = new Alumno("958723156L", "Jose Antonio Del Fresno", "H", 30, curso);
		
		Alumno alu3 = new Alumno();
		alu3.setNombreCompleto("Irene Diaz Pinedo");
		alu3.setDni("452689123T");
		alu3.setEdad(41);
		alu3.setSexo("M");
		
		System.out.println(profe);
		System.out.println(curso);
		System.out.println(alu1);
		System.out.println(alu2);
		
		
		ArrayList<Alumno> listaAlumnosJava = new ArrayList<Alumno>();
		
		listaAlumnosJava.add(alu3);
		listaAlumnosJava.add(alu2);
		

		ArrayList<Alumno> listaAlumnosMatematicas = new ArrayList<Alumno>();
		
		listaAlumnosMatematicas.add(alu1);
		listaAlumnosMatematicas.add(alu3);
		
		ArrayList<Certificado>listaACertificadosProfesor = new ArrayList<Certificado>();

	}
	
		
	
	
	
	
	
}
