package designpattern_builder;

public class Main {

	public static void main(String[] args) {
		Person person = Person.builder("giggio", "griggio")
				.withAge(1)
				.withAddress("dai cicci")
				.build();
		System.out.println(person);
	}

}
