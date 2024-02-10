package designpattern_factory;

public class ShapeFactory {
	public Shape returnShape(Shapes shape) {
		return switch (shape) {
		case CIRCLE -> new Circle();
		case RECTANGLE -> new Rectangle();
		case RHOMBUS -> new Rhombus();
		case SQUARE -> new Square();
		case TRIANGLE -> new Triangle();
		default -> throw new IllegalArgumentException();
		};
	}
}
