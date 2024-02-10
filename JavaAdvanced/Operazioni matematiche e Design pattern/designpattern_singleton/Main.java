package designpattern_singleton;

public class Main {

	public static void main(String[] args) {
		User user1 = User.getUser();
		System.out.println(user1);
		
		User.getUser().setName("John");
		User.getUser().setAge(27);
		User user2 = User.getUser();
		System.out.println(user2);
	}
}
