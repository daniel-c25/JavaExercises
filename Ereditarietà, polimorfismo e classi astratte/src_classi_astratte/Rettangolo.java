package src_classi_astratte;

public class Rettangolo extends Forma{

	public Rettangolo(double altezza, double base) {
		super(altezza, base);
	}
	
	public Rettangolo() {
		
	}
	
	public void calcolaArea() {
		super.setArea(super.getAltezza() * super.getBase());
	}
}
