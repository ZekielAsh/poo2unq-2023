package ar.edu.unq.obj2.tp1;

public class Jefe {
	private Secretario secretario;
	
	public void trabajarConFicha(Ficha ficha) {
		this.secretario.buscarEnFichero(ficha);
	}
}
