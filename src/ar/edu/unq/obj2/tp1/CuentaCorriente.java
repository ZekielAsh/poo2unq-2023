package ar.edu.unq.obj2.tp1;

public class CuentaCorriente extends CuentaBancaria{

	private float rojoPermitido() {
		return 100;
	}

	@Override
	public void extraer(float monto) {
		if(this.getSaldo() + this.rojoPermitido() >= monto) {
			this.setSaldo(this.getSaldo() - monto);
		}
	}
}
