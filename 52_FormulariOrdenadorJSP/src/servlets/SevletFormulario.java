package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.entidad.Cliente;

import modelo.entidad.Pc;
//import modelo.negocio.GestorPc;


@WebServlet("/SevletFormulario")
public class SevletFormulario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("pidiendo datos cliente");
		
		String nCliente = request.getParameter("nombre");
		String dCliente = request.getParameter("direccion");
		String eCliente = request.getParameter("email");
		
		System.out.println("pidiendo datos pc");
		
		String ram = request.getParameter("ram");
		String procesador = request.getParameter("procesador");
		String[] componentes = request.getParameterValues("componente");
		String comentarios = request.getParameter("comentarios");

		System.out.println("creando cliente");
		Cliente cliente = new Cliente();
		cliente.setNombre(nCliente);
		cliente.setDireccion(dCliente);
		cliente.setEmail(eCliente);
		
		System.out.println("Creando array de componentes");

		List<String> listaComponentes = new ArrayList<String>();
		listaComponentes = Arrays.asList(componentes);
		
		System.out.println("Creando pc");
		Pc pc = new Pc();
		pc.setCliente(cliente);
		pc.setProcesador(procesador);
		pc.setRam(ram);
		pc.setArraycomponentes(componentes);
		pc.setComentarios(comentarios);
		
		
		/*GestorPc gp = new GestorPc();
		
		boolean validada = gp.validar(pc);
		if (validada) {

			response.sendRedirect("inicio.html");
			System.out.println("Pedido validado");
		} else {
			response.sendRedirect("formulario.html");
			System.out.println("Pedido no validado");

		}
		*/
		
		//Metemos en la request los valores que 
				//quiero pasar a jsp
		
		System.out.println("mandando valores cliente");
				
				request.setAttribute("cliente", cliente);
				request.setAttribute("pc", pc);
				request.setAttribute("nombre", nCliente);
				request.setAttribute("direccion", dCliente);
				request.setAttribute("email", eCliente);
				
				System.out.println("mandando valores pc");
				request.setAttribute("procesador", procesador);
				request.setAttribute("ram", ram);
				request.setAttribute("componentes", componentes);
				request.setAttribute("comentarios", comentarios);
				
				System.out.println("mandando valores a jsp");
				request.getRequestDispatcher("final.jsp").forward(request, response);
	}
		
	}

