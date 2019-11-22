package main;

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

		// Doy valos a los atributos del certificado.
		Certificado curso = new Certificado();
		curso.setNombreCurso("Java");
		curso.setProfesor(profe);
		curso.setIdCurso("1519F");
		curso.setHoras(600.45);
		curso.setPrecio(6000.50);

		// Doy valor a los atributos del alumno usando los setter.
		Alumno alu1 = new Alumno();
		alu1.setNombreCompleto("Loreto Diaz Pinedo");
		alu1.setDni("65897412C");
		alu1.setSexo("M");
		alu1.setEdad(43);
		alu1.setProfesor(curso);

		// Doy valor a los atributos del segundo alumno usando el constructor.

		Alumno alu2 = new Alumno("958723156L", "Jose Antonio Del Fresno", "H", 30, curso);

		System.out.println(profe);
		System.out.println(curso);
		System.out.println(alu1);
		System.out.println(alu2);

	}

}
