package src_enum;

public class Rettangolo extends Forma{

	TipoForma rettangolo = TipoForma.RETTANGOLO;
	
	public Rettangolo(double base, double altezza) {
		super(base, altezza);
	}
	
	public TipoForma getRettangolo() {
		return rettangolo;
	}

	public void setRettangolo(TipoForma rettangolo) {
		this.rettangolo = rettangolo;
	}

	@Override
	public void calcolaArea() {
		getRettangolo().setArea(super.getAltezza() * super.getBase());
		System.out.println(getRettangolo().getArea() + " = area rettangolo");
	}
	
}
