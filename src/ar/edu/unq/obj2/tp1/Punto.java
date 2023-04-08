package ar.edu.unq.obj2.tp1;

public class Punto {
	private float x;
	private float y;
	
	public Punto(float x, float y) {
		super();
		this.setX(x);
		this.setY(y);
	}

	public float getX() {
		return x;
	}

	private void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	private void setY(float y) {
		this.y = y;
	}
}
