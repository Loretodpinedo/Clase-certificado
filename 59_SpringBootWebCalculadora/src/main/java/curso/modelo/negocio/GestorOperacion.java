package curso.modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import curso.modelo.entidad.Operacion;
import curso.modelo.persistencia.OperacionDao;
//import curso.modelo.persistencia.OperacionDao;

@Service
public class GestorOperacion {

	@Autowired
	private OperacionDao operacionDao;
	

	@Transactional
	public void operar(Operacion op) {

		double resultado = 0;
		

		switch (op.getOperador()) {
		case "suma":
			resultado = suma(op.getNum1(),op.getNum2());
			break;
		case "resta":
			resultado = resta(op.getNum1(),op.getNum2());
			break;
		case "multiplicacion":
			resultado = multiplicacion(op.getNum1(),op.getNum2());
			break;
		case "division":
			resultado = division(op.getNum1(),op.getNum2());
			break;
		default:
			System.out.println("Algo no ha ido bien");
		}
		
	
		
		op.setResultado(resultado);
	
		//persistir el objeto
		operacionDao.save(op);
		
	}
	
	public  List<Operacion> listar(){
		return operacionDao.findAll();
	}

	public double suma(double num1, double num2) {
		double resultado;
		resultado = num1 + num2;
		return resultado;
	}


	public double resta(double num1, double num2) {
		double resultado;
		resultado = num1 - num2;
		return resultado;
	}


	public double multiplicacion(double num1, double num2) {
		double resultado;
		resultado = (num1 * num2);
		return resultado;
	}


	public double division(double num1, double num2) {
		double resultado;
		resultado = num1 / num2;
		return resultado;
	}

	public Operacion getOperacionById(int id) {
		return operacionDao.findById(id);
		
	}

}
