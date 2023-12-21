package main;

public class Main{
	
	public static void main(String[] args) {
		Auto auto = new Auto("EN 289 CC", "Toyota", 1399, "Yaris");
		
		System.out.println(auto.toString());
		System.out.println(auto.getCilindrata());
	}
}