package ar.edu.unq.obj2.tp2;

public class EmpleadoContratado extends Empleado {
	
	private int nroDeContrato;
	private String medioDePago;

	@Override
	public double calcularSueldoBruto() {
		return this.sueldoBasico;
	}
	
	@Override
	public double calcularRetenciones() {
		return 50;
	}

	@Override
	public double calcularRetencionesPorAportesJubilatorios() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularRetencionesPorObraSocial() {
		// TODO Auto-generated method stub
		return 0;
	}

}
