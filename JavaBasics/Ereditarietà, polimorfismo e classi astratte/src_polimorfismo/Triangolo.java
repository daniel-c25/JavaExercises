package src_polimorfismo;

public class Triangolo implements Forma{
	
	private double altezza;
	private double base;
	
	public Triangolo(double altezza, double base) {
		this.altezza = altezza;
		this.base = base;
	}
	
	public Triangolo() {
		
	}
	
	public double getAltezza() {
		return altezza;
	}
	
	public double getBase() {
		return base;
	}

	public Double calcolaArea() {
		return this.getAltezza() * this.getBase() / 2;
	}
	
}
