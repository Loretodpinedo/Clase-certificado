package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.entidad.Cliente;
import modelo.negocio.gestorCliente;



@WebServlet("/ServletLoguin")//Esto es el mapeo, se puede cambiar el nombre que aparecera en la url.
public class ServletLoguin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ServletLoguin() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// los parametros tienen que conincidir con los dle cuestionario.
		 String nombre = request.getParameter("nombre");
		 String contraseña = request.getParameter("contraseña");
		 
		 Cliente c = new Cliente ();
		 
		 c.setNombre(nombre);
		 c.setContraseña(contraseña);
		 
		 gestorCliente gc= new gestorCliente();
		 boolean logado = gc.logado(c);
		 
		 if (logado) {
			 
			 System.out.println("cliente " + c + " logado");
			 response.sendRedirect("/ServletDatos?=nombre + nombre");
		 }else {
			 System.out.println("cliente " + c + " no es correcto");
			 response.sendRedirect("loguin.jsp?error=Usuario no correcto");
		 }
		 
		 
		
	}

}
