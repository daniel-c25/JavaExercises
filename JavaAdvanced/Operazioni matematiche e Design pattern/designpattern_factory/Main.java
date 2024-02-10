package designpattern_factory;

public class Main {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		shapeFactory.returnShape(Shapes.CIRCLE).draw();
	}

}
