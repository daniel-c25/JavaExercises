package src_ereditarieta_2;

public class Rettangolo extends Forma{
	
	public Rettangolo(double base, double altezza) {
		super(base, altezza);
	}
	
	@Override
	public void calcolaArea() {
		super.setArea(super.getBase() * super.getAltezza());
	}
}