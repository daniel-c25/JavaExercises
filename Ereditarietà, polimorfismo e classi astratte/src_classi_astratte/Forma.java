package src_classi_astratte;

public abstract class Forma {
	
	private double area;
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	public abstract void calcolaArea();
	
}
