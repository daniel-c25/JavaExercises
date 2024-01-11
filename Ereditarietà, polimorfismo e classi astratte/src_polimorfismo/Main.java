package src_polimorfismo;

public class Main {
	
	public static void main(String[] args) {
		
		Rettangolo rettangolo = new Rettangolo(3, 9);
		rettangolo.calcolaArea();
		System.out.println(rettangolo.getArea() + " = area rettangolo");
		
		Triangolo triangolo = new Triangolo(3, 9);
		triangolo.calcolaArea();
		System.out.println(triangolo.getArea() + " = area triangolo");
	}

}
