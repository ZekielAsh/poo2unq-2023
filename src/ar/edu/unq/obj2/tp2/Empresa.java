package ar.edu.unq.obj2.tp2;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String nombre;
	private int cuit;
	private List<ReciboDeHaberes> recibos = new ArrayList<ReciboDeHaberes>();
	private List<Empleado> empleados;
	
	public Empresa(String nombre, int cuit, List<Empleado> empleados) {
		this.setNombre(nombre);
		this.setCuit(cuit);
		this.setEmpleados(empleados);
	}

	public String getNombre() {
		return nombre;
	}

	public int getCuit() {
		return cuit;
	}

	public List<ReciboDeHaberes> getRecibos() {
		return recibos;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setCuit(int cuit) {
		this.cuit = cuit;
	
	}

	private void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	public double montoTotalSueldosNeto() {
		double monto;
		monto = this.getEmpleados().
				stream().
				mapToDouble(p -> p.calcularSueldoNeto()).
				reduce(0, (acumulado, nuevo) -> acumulado+nuevo);
		return monto;
	}
	
	public double montoTotalSueldosBruto() {
		double monto;
		monto = this.getEmpleados().
				stream().
				mapToDouble(p -> p.calcularSueldoBruto()).
				reduce(0, (acumulado, nuevo) -> acumulado+nuevo);
		return monto;
	}
	
	public double montoTotalRetenciones() {
		double monto;
		monto = this.getEmpleados().
				stream().
				mapToDouble(p -> p.calcularRetenciones()).
				reduce(0, (acumulado, nuevo) -> acumulado+nuevo);
		return monto;	
	}
	
	public void liquidarSueldos() {
		this.empleados.
		stream().
		forEach(p -> this.recibos.add(new ReciboDeHaberes(p)));
	}
	
}
