package curso.modelo.negocio;

import org.eclipse.jdt.internal.compiler.ast.SwitchExpression;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import curso.modelo.controlador.ControladorOperacion;
import curso.modelo.entidad.Operacion;
import curso.modelo.persistencia.OperacionDao;
//import curso.modelo.persistencia.OperacionDao;

@Service
public class GestorOperacion {

	@Autowired
	private OperacionDao operacionDao;
	@Autowired
	private Operacion ope;
	@Autowired
	private ControladorOperacion cont;
	
	

	Switch(operacion){
	case "suma":
	}
		
	@Transactional
	public double suma(double num1, double num2, double resultado) {

		resultado = num1 + num2;
		return resultado;
	}
	
	@Transactional
	public double resta(double num1, double num2, double resultado) {

		resultado = num1 - num2;
		return resultado;
	}
	
	@Transactional
	public double multiplicacion(double num1, double num2, double resultado) {

		resultado = num1 * num2;
		return resultado;
	}
	
	@Transactional
	public double division(double num1, double num2, double resultado) {

		resultado = num1 / num2;
		return resultado;
	}
	
	
}
