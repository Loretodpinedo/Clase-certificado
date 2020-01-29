

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.security.ntlm.Client;

import modelo.entidad.Cliente;
import modelo.entidad.Componente;
import modelo.entidad.Pc;
import modelo.negocio.GestorPc;


@WebServlet("/SevletFormulario")
public class SevletFormulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SevletFormulario() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String nCliente = request.getParameter("nombre");
	String dCliente = request.getParameter("direccion");
	String eCliente = request.getParameter("email");
	String ram = request.getParameter("ram");
	String procesador = request.getParameter("procesador");
	String[] componentes = request.getParameterValues("componente");
	
	
	Cliente cliente = new Cliente();
	cliente.setNombre(nCliente);
	cliente.setDireccion(dCliente);
	cliente.setEmail(eCliente);
	
	ArrayList<Componente> comPc = new ArrayList<Componente>();
	
	for (Componente c : comPc) {
		if(!comPc.isEmpty()) {
			comPc.add(c);
		}
	}
		
	Pc pc = new Pc();
	pc.setCliente(cliente);
	pc.setProcesador(procesador);
	pc.setRam(ram);
	pc.setComponentes(comPc);
	
	//faltan los comentarios
	
	GestorPc gp = new GestorPc();
	boolean validada = gp.validar(pc);
	if (validada) {
		
		response.sendRedirect("inicio.html");
	}else {
		response.sendRedirect("formulario.html");
		
	}
	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
