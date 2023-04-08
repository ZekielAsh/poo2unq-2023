package ar.edu.unq.obj2.tp1;

public abstract class CuentaBancaria{
	protected float saldo;
	

	public float getSaldo() {
		return this.saldo;
	}
	
	protected void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public abstract void extraer(float monto);
	
}
