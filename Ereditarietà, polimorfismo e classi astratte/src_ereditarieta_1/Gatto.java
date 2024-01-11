package src_ereditarieta_1;

public class Gatto extends Animale{

	public Gatto(String verso) {
		super(verso);
	}

	@Override
	public void faiIlVerso() {
		System.out.println(super.getVerso());
	}
	
}
