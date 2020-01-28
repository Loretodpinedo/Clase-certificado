package servlet;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimerServlet
 * Un Servlet es un objeto singleton gestionado por 
 * el contexto de Tomcat
 * 
 * Tenemos que extender la clase de HttpServlet
 * 
 * Por otro lado tenemos que decirle a tomcat que de de alta este
 * objeto. Concepto de IoC, nosotros no creamos este objeto
 * es decir, no hacemos new de PrimerServlet, si no que tomcat
 * llevara el ciclo de vida por nosotros. "no nos llame usted,
 * ya le llamaremos nosotros"
 * Dos maneras de dar de alta un objeto en el contexto de Tomcat
 * por XML (web.xml) o por anotaciones
 * 
 * Como hemos elegido crear el proyecto con descritor web.xml
 * 2.5, solo podemos hacerlo por xml
 */
public class PrimerServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    
    public PrimerServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Direccion Remota " + request.getRemoteAddr());
		
		
		if(request.getRemoteAddr().equals("192.168.1.85")){
			response.getWriter().append(""
					+ "<html>"
					+ "<body>"
					+ "<title>Aqui no Maricarmen</title>"
					+ "<h1 style='color:red'>Estas baneado Maricarmen!!</h1>"
					+ "</body>"
					+ "</html>");
			
		}if(request.getRemoteAddr().equals("192.168.1.90")) {
			response.getWriter().append(""
					+ "<html>"
					+ "<body>"
					+ "<title>Hola Jose</title>"
					+"<marquee style='color: blue; font-family: Bookman Old Style; font-size: 90px'>Hola Jose</marquee>"
					+ "<img alt='Tabla de multiplicar' src='tablamultiplicar.png'>"
					+ "</body>"
					+ "</html>");
			
		}if(request.getRemoteAddr().equals("192.168.1.50")) {
			response.getWriter().append(""
					+ "<html>"
					+ "<body>"
					+ "<title>Hola Felix</title>"
					+"<marquee style='color: yellow; font-family: Bookman Old Style; font-size: 30px'>Hola Felix</marquee>"
					+"<h1 style='color:yellow' 'aling: center'>Hola Félix</h1>"
					+ "<img alt='Tabla de multiplicar' src='tablamultiplicar.png'>"
					+ "</body>"
					+ "</html>");
		}else {
		
			response.getWriter().append(""
					+ "<html>"
					+ "<body>"
					+ "<title>Tablas de multiplicar</title>"
					+ "<img alt='Tabla de multiplicar' src='tablamultiplicar.png'>"
					+ "</body>"
					+ "</html>");
		}
		response.setContentType("text/html");
	}
	
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
