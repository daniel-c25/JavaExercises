package designpattern_factory;

public interface Shape {
	default void draw() {
		System.out.println(this);
	};
}
