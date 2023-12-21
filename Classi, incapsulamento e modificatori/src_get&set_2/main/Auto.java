package main;

public class Auto{
	
	//variabili di istanza
	public String targa;
	public String marca;
	public int cilindrata;
	public String modello;
	
	public void setTarga(String targa) {
		this.targa = targa;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	
	public void setModello(String modello) {
		this.modello = modello;
	}
	
	public String getTarga() {
		return targa;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public int getCilindrata() {
		return cilindrata;
	}
	
	public String getModello() {
		return modello;
	}
	
	public Auto (String targa, String marca, int cilindrata, String modello) {
		this.targa = targa;
		this.marca = marca;
		this.cilindrata = cilindrata;
		this.modello = modello;
	}

	@Override
	public String toString() {
		return "Auto [targa=" + targa + ", marca=" + marca + ", cilindrata=" + cilindrata + ", modello=" + modello
				+ "]";
	}
	
}
