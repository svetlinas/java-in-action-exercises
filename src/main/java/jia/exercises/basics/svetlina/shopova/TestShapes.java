package jia.exercises.basics.svetlina.shopova;

public class TestShapes {

	private static int i = 0;

	private static void addToArray(Shape[] array, Shape shape) {
		array[i++] = shape;
	}

	public static void main(String[] args) {

		Shape[] array = new Shape[10];

		Rectangle rectangle1 = new Rectangle(2, 5);
		addToArray(array, rectangle1);

		Circle circle1 = new Circle(2);
		addToArray(array, circle1);

		Square square1 = new Square(5);
		addToArray(array, square1);

		Rectangle rectangle2 = new Rectangle(4, 7);
		addToArray(array, rectangle2);

		Rectangle rectangle3 = new Rectangle(5, 6);
		addToArray(array, rectangle3);

		Circle circle2 = new Circle(6);
		addToArray(array, circle2);

		Square square2 = new Square(10);
		addToArray(array, square2);

		Circle circle3 = new Circle(2);
		addToArray(array, circle3);

		Square square3 = new Square(2.3);
		addToArray(array, square3);

		Square square4 = new Square(5.7);
		addToArray(array, square4);

		for (Shape shape : array) {
			System.out.println(shape.toString());
		}

	}
}
