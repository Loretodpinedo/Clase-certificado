package entidad;

public class JefeProyecto extends Empleado {

	private double incentivos = 0.0;

	
	@Override
	public double salarioTotal() {
		return getSalarioBase() + incentivos;
	}

	public double getIncentivos() {
		return incentivos;
	}

	public void setIncentivos(double incentivos) {
		this.incentivos = incentivos;
	}

}
