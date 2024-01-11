package src_ereditarieta_1;

public class Animale {

	private String verso;

	public Animale(String verso) {
		this.verso = verso;
	}

	public String getVerso() {
		return verso;
	}

	public void setVerso(String verso) {
		this.verso = verso;
	}
	
	public void faiIlVerso() {
		System.out.println(this.verso);
	}
	
}
