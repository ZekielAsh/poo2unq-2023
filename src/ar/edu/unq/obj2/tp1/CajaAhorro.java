package ar.edu.unq.obj2.tp1;

public class CajaAhorro extends CuentaBancaria{
	
	@Override
	public void extraer(float monto) {
		if(this.getSaldo() >= monto) {
			this.setSaldo(this.getSaldo() - monto);
		}
	}

}
