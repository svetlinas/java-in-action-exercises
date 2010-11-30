package jia.exercises.basics.svetlina.shopova;

public class Circle extends Shape {

	private final String SHAPE = "Circle";

	private double radius;

	public Circle() {
		this.radius = 0;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double area() {
		if (isRadiusInitialized()) {
			double result = Math.PI * Math.pow(radius, 2);
			return result;
		}
		return 0;
	}

	private boolean isRadiusInitialized() {
		if (radius == 0) {
			System.out.println("Radius is zero!");
			return false;
		}
		return true;
	}

	@Override
	public double perimeter() {
		return circumference();
	}

	private double circumference() {
		if (isRadiusInitialized()) {
			double result = 2 * Math.PI * radius;
			return result;
		}
		return 0;
	}

	@Override
	public String toString() {
		String classVariables = "The " + SHAPE + "'s radius is " + radius + ". ";
		String result = classVariables + super.toString();
		return result;
	}

}
