package jia.exercises.basics.svetlina.shopova;

public abstract class Shape {

	public abstract double perimeter();

	public abstract double area();

	@Override
	public String toString() {
		// tried to use StringBuilder but thought it was pointless 'cuz you'll
		// need a 7-8 append methods to get the wanted result
		String result = "It's perimeter and area equal " + this.perimeter()
				+ " and " + this.area() + ".";
		return result;
	}

}
