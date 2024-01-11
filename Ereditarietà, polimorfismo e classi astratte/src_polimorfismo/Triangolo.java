package src_polimorfismo;

public class Triangolo extends Forma{
	
	public Triangolo(double altezza, double base) {
		super(altezza, base);
	}
	
	public Triangolo() {
		
	}
	
	@Override
	public void calcolaArea() {
		super.setArea(super.getAltezza()*super.getBase()/2);
	}
	
}
