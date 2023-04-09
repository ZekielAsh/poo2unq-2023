package ar.edu.unq.obj2.tp2;

import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado {
	private int cantidadDeHijos;
	private int antigüedad;
	
	
	public EmpleadoPermanente(String nombre, String direccion, boolean estadoCivil, 
			LocalDate nacimiento, double sueldoB, int cantidadDeHijos, int antigüedad) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estaCasado = estadoCivil;
		this.fechaDeNacimiento = nacimiento;
		this.sueldoBasico = sueldoB;
		this.cantidadDeHijos = cantidadDeHijos;
		this.antigüedad = antigüedad;
	}


	public double asignaciónPorAntigüedad() {
		return 50*this.antigüedad;
	}
	
	public double asignaciónPorConyuge() {
		if(this.estaCasado) { return 100; } 
		else { return 0; }
	}
	
	public double asignaciónPorHijo() {
		return 150*this.cantidadDeHijos;
	}
	
	public double salarioFamiliar() {
		return 	this.asignaciónPorAntigüedad() 	+ 
				this.asignaciónPorConyuge() 	+
				this.asignaciónPorHijo();
	}
	
	@Override
	public double calcularSueldoBruto() {
		return this.sueldoBasico + this.salarioFamiliar();
	}
	
	@Override
	public double calcularRetencionesPorAportesJubilatorios() {
		double retenciones;
		retenciones = (this.calcularSueldoBruto() / 20) * 3;
		return retenciones;
	}

	@Override
	public double calcularRetencionesPorObraSocial() {
		double retenciones;
		retenciones = this.calcularSueldoBruto() / 10 + (20*this.cantidadDeHijos);
		return retenciones;
	}

}
