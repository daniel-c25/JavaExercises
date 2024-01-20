package src_polimorfismo;

public class Rettangolo implements Forma{

	private double altezza;
	private double base;
	
	public Rettangolo(double altezza, double base) {
		this.altezza = altezza;
		this.base = base;
	}
	
	public Rettangolo() {
		
	}
	
	public double getAltezza() {
		return altezza;
	}
	
	public double getBase() {
		return base;
	}
	
	public Double calcolaArea() {
		return this.getAltezza() * this.getBase();
	}
}
