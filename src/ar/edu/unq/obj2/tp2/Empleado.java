package ar.edu.unq.obj2.tp2;

import java.time.LocalDate;
import java.time.Period;

public abstract class Empleado {
	protected String nombre;
	protected String direccion;
	protected boolean estaCasado;
	protected LocalDate fechaDeNacimiento;
	protected double sueldoBasico;
	
	public int edad() {
		return Period.between(fechaDeNacimiento, LocalDate.now()).getYears();
	}
	
	public double calcularSueldoNeto() {
		return this.calcularSueldoBruto() - this.calcularRetenciones();
	}
	
	public abstract double calcularSueldoBruto();


	public double calcularRetenciones() {
		return this.calcularRetencionesPorAportesJubilatorios() + 
				this.calcularRetencionesPorObraSocial();
	}
	
	public abstract double calcularRetencionesPorAportesJubilatorios();
	
	public abstract double calcularRetencionesPorObraSocial();
}