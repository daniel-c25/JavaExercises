package src_polimorfismo;

public class Main {
	
	public static void main(String[] args) {
		
		Rettangolo rettangolo = new Rettangolo(3, 9);
		System.out.println(rettangolo.calcolaArea() + " = area rettangolo");
		
		Triangolo triangolo = new Triangolo(3, 9);
		System.out.println(triangolo.calcolaArea() + " = area triangolo");
	}

}
