package designpattern_builder;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private String address;

	private Person(PersonBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.address = builder.address;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public static PersonBuilder builder(String firstName, String lastName) {
		return new PersonBuilder(firstName, lastName);
	}
	
	
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address=" + address
				+ "]";
	}



	public static final class PersonBuilder {
		private String firstName;
		private String lastName;
		private int age;
		private String address;

		private PersonBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public PersonBuilder withAge(int age) {
			this.age = age;
			return this;
		}

		public PersonBuilder withAddress(String address) {
			this.address = address;
			return this;
		}

		public Person build() {
			return new Person(this);
		}
	}
}
