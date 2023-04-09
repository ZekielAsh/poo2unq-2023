package ar.edu.unq.obj2.tp2;

import java.time.LocalDate;

public class EmpleadoTemporal extends Empleado{
	private LocalDate fechaFin;
	private int horasExtras;
	
	public EmpleadoTemporal(String nombre, String direccion, boolean estadoCivil, 
			LocalDate nacimiento, double sueldoB,LocalDate fechaFin, int horasExtras) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estaCasado = estadoCivil;
		this.fechaDeNacimiento = nacimiento;
		this.sueldoBasico = sueldoB;
		this.fechaFin = fechaFin;
		this.horasExtras = horasExtras;
	}
	
	public double asignaciónPorhorasExtra() {
		return 40 * this.horasExtras;
	}

	@Override
	public double calcularSueldoBruto() {
		return this.sueldoBasico + this.asignaciónPorhorasExtra();
	}
	
	@Override
	public double calcularRetencionesPorAportesJubilatorios() {
		double retenciones;
		retenciones = this.calcularSueldoBruto() / 10 + 5*this.horasExtras;
		return retenciones;
	}
	
	@Override
	public double calcularRetencionesPorObraSocial() {
		double retenciones;
		retenciones = this.calcularSueldoBruto() / 10;
		if(this.edad() > 50) {
					retenciones += 25;
				};
		return retenciones;
	}
	
	

}
