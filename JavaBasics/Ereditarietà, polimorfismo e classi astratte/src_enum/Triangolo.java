package src_enum;

public class Triangolo extends Forma{
	
	private TipoForma triangolo = TipoForma.TRIANGOLO;
	
	public Triangolo(double base, double altezza) {
		super(base, altezza);
	}

	public TipoForma getTriangolo() {
		return triangolo;
	}

	public void setTriangolo(TipoForma triangolo) {
		this.triangolo = triangolo;
	}

	@Override
	public void calcolaArea() {
		getTriangolo().setArea(super.getAltezza() * super.getBase() / 2);
		System.out.println(getTriangolo().getArea() + " = area triangolo");
	}
	
}
