package main;

public class Student {
	
	//variabili di istanza
	public String nome;
	public String cognome;
	public int ID; //identificativo
	
	public void setNome(String nome) {
		this.nome = nome; //senza variabile locale passata come parametro, 
							//c'è il "this." implicito
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public int getID() {
		return ID;
	}
	
	public Student (String nome, String cognome, int ID) {
		this.nome = nome;
		this.cognome = cognome;
		this.ID = ID;
	}

	@Override
	public String toString() {
		return "Student [nome=" + nome + ", cognome=" + cognome + ", ID=" + ID + "]";
	}
	
}
