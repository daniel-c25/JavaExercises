package src_interfacce;

public class Main {

	public static void main(String[] args) {

		Rettangolo rettangolo = new Rettangolo(3, 7);
		Triangolo triangolo = new Triangolo(5, 4);
		
		rettangolo.calcolaArea();
		triangolo.calcolaArea();
		
		System.out.println(rettangolo.getArea());
		System.out.println(triangolo.getArea());
		
	}

}
