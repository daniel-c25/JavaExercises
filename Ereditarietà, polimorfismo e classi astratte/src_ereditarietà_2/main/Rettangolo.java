package main;

public class Rettangolo extends Forma{
	
	public double base = 3.0;
	public double altezza = 9.0;
	
	@Override
	public void calcolaArea() {
		area = base*altezza;
		System.out.println(area);
	}
}
