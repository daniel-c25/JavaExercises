package src_enum;

public enum TipoForma {
	TRIANGOLO(0.0),
	RETTANGOLO(0.0);
	
	private double area;
	
	private TipoForma(double area) {
		this.area = area;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
}
