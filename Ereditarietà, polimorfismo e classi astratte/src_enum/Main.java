package src_enum;

public class Main {
	
	//Scrivere un programma che contenga una classe chiamata Forma ed un metodo chiamato calcolaArea()
	//che stampi l'area della forma specifica.
	//Crea poi due sottoclassi Triangolo e Rettangolo che estendono Forma e che abbiano un tipo che ne
	//identifichi la Forma in maniera univoca usando una enum.
	
	public static void main(String[] args) {
		Triangolo triangolo = new Triangolo(7.0, 5.0);
		triangolo.calcolaArea();
		
		Rettangolo rettangolo = new Rettangolo(7.0, 5.0);
		rettangolo.calcolaArea();
	}

}
