package src_polimorfismo;

public class Rettangolo extends Forma{

	public Rettangolo(double altezza, double base) {
		super(altezza, base);
	}
	
	public Rettangolo() {
		
	}
	
	@Override
	public void calcolaArea() {
		super.setArea(super.getAltezza() * super.getBase());
	}
}
