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

import com.sun.security.ntlm.Client;

import modelo.entidad.Cliente;

import modelo.entidad.Pc;
import modelo.negocio.GestorPc;

@WebServlet("/SevletFormulario")
public class SevletFormulario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nCliente = request.getParameter("nombre");
		String dCliente = request.getParameter("direccion");
		String eCliente = request.getParameter("email");
		String ram = request.getParameter("ram");
		String procesador = request.getParameter("procesador");
		String[] componentes = request.getParameterValues("componente");
		String comentarios = request.getParameter("comentarios");

		Cliente cliente = new Cliente();
		cliente.setNombre(nCliente);
		cliente.setDireccion(dCliente);
		cliente.setEmail(eCliente);

		List<String> listaComponentes = new ArrayList<String>();
		listaComponentes = Arrays.asList(componentes);
		
		Pc pc = new Pc();
		pc.setCliente(cliente);
		pc.setProcesador(procesador);
		pc.setRam(ram);
		pc.setArraycomponentes(componentes);
		pc.setComentarios(comentarios);

	

		GestorPc gp = new GestorPc();
		
		boolean validada = gp.validar(pc);
		if (validada) {

			response.sendRedirect("inicio.html");
			System.out.println("Pedido validado");
		} else {
			response.sendRedirect("formulario.html");
			System.out.println("Pedido no validado");

		}
	}
}
