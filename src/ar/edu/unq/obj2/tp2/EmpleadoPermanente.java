package ar.edu.unq.obj2.tp2;

import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado {
	private int cantidadDeHijos;
	private int antig�edad;
	
	
	public EmpleadoPermanente(String nombre, String direccion, boolean estadoCivil, 
			LocalDate nacimiento, double sueldoB, int cantidadDeHijos, int antig�edad) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estaCasado = estadoCivil;
		this.fechaDeNacimiento = nacimiento;
		this.sueldoBasico = sueldoB;
		this.cantidadDeHijos = cantidadDeHijos;
		this.antig�edad = antig�edad;
	}


	public double asignaci�nPorAntig�edad() {
		return 50*this.antig�edad;
	}
	
	public double asignaci�nPorConyuge() {
		if(this.estaCasado) { return 100; } 
		else { return 0; }
	}
	
	public double asignaci�nPorHijo() {
		return 150*this.cantidadDeHijos;
	}
	
	public double salarioFamiliar() {
		return 	this.asignaci�nPorAntig�edad() 	+ 
				this.asignaci�nPorConyuge() 	+
				this.asignaci�nPorHijo();
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
