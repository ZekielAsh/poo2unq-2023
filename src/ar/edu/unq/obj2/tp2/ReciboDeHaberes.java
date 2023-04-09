package ar.edu.unq.obj2.tp2;

import java.time.LocalDate;

public class ReciboDeHaberes {
	private String nombreEmpleado;
	private String direccionEmpleado;
	private LocalDate fechaDeEmision;
	private double sueldoBruto;
	private double sueldoNeto;
	
	public ReciboDeHaberes(Empleado e) {
		this.nombreEmpleado = e.nombre;
		this.direccionEmpleado = e.direccion;
		this.fechaDeEmision = LocalDate.now();
		this.sueldoBruto = e.calcularSueldoBruto();
		this.sueldoNeto = e.calcularSueldoNeto();
	}
}
