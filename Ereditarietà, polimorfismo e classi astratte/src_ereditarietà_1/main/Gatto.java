package main;

public class Gatto extends Animale{
	
	public Gatto() {
		super.setVerso("Miao");
	}
	
	@Override
	public void faiIlVerso() {
		System.out.println(getVerso());
	}
	
}
