package jia.exercises.basics.svetlina.shopova;

public class Square extends Shape {

	private final String SHAPE = "Square";

	private double length;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public Square() {
		this.length = 0;
	}

	public Square(double length) {
		this.length = length;
	}

	@Override
	public double perimeter() {
		if (isLengthInitialized()) {
			double result = 4 * length;
			return result;
		}
		return 0;
	}

	private boolean isLengthInitialized() {
		if (length == 0) {
			System.out.println("The length is zero!");
			return false;
		}
		return true;
	}

	@Override
	public double area() {
		if (isLengthInitialized()) {
			double result = Math.pow(this.length, 2);
			return result;
		}
		return 0;
	}

	@Override
	public String toString() {
		String classVariables = "The " + SHAPE + "'s length is " + length + ". ";
		String result = classVariables + super.toString();
		return result;
	}

}
