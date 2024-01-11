package src_ereditarieta_2;

public class Forma {
	
	private double area;
	private double base;
	private double altezza;
	
	public Forma(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	public void calcolaArea() {
		System.out.println(this.area);
	}
	
}
