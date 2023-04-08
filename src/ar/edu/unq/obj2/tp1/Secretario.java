package ar.edu.unq.obj2.tp1;

public class Secretario {
	private Fichero fichero;
	
	public Ficha buscarEnFichero(Ficha ficha) {
		return this.fichero.buscar(ficha);	
	}
}
