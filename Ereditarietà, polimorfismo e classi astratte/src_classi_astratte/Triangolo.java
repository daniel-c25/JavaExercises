package src_classi_astratte;

public class Triangolo extends Forma{
	
	public Triangolo(double altezza, double base) {
		super(altezza, base);
	}
	
	public void calcolaArea() {
		super.setArea(super.getAltezza()*super.getBase()/2);
	}
	
}
