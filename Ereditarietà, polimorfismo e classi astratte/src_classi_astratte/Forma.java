package src_classi_astratte;

public abstract class Forma {
	
	private double altezza;
	private double base;
	private double area;

	public Forma() {
		
	}

	public Forma(double altezza, double base) {
		this.altezza = altezza;
		this.base = base;
	}
	
	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	public abstract void calcolaArea();
	
}
