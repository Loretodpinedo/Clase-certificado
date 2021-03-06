package curso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import curso.entidad.Pelicula;


//Esto es una aplicacion spring boot sin web
//hay que meter las librerias RestTemplate a mano en el pom
//si se hubiera usado un starter web no hubieran hecho falta

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		RestTemplate restTemplate = new RestTemplate();
        String URL = "http://192.168.1.71:8080/peliculas";
        Pelicula pelicula = restTemplate.getForObject(URL, Pelicula.class);
        System.out.println("Pelicula consumida del servidio rest...");
        System.out.println(pelicula);
	}
	}


