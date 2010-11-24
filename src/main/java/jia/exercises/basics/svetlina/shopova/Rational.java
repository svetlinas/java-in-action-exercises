package jia.exercises.basics.svetlina.shopova;

public class Rational {
	// It's better for the realization the class to be named Rational and not
	// Exercise6 ;)

	private static final int ADD = 0;
	private static final int SUBSTRACT = 1;
	private static final int MULTIPLY = 2;
	private static final int DIVIDE = 3;

	private int nominator;
	private int denominator;

	public Rational(int nominator, int denominator) {
		if (denominator == 0)
			throw new RuntimeException("Dominator must not be zero!");
		int nod1 = nod(nominator, denominator);
		
		this.nominator = nominator / nod1;
		this.denominator = denominator / nod1;
	}

	public Rational reciprocal() {
		int temp = this.denominator;
		this.denominator = this.nominator;
		this.nominator = temp;
		return this;
	}

	@Override
	public String toString() {
		if (denominator < 0) {
			denominator = Math.abs(denominator);
			nominator =  - nominator;
		}
		if (denominator == 1)
			return nominator + "";
		else
			return nominator + "/" + denominator;
	}

	public Rational add(Rational rational) {
		Rational newRational = operation(ADD, rational);
		return newRational;
	}

	public Rational substract(Rational rational) {
		Rational newRational = operation(SUBSTRACT, rational);
		return newRational;
	}

	public Rational multiply(Rational rational) {
		Rational newRational = operation(MULTIPLY, rational);
		return newRational;
	}

	public Rational divide(Rational rational) {
		Rational newRational = operation(DIVIDE, rational);
		return newRational;
	}

	public Rational add(int integerNumber) {
		Rational newRational = operation(ADD, new Rational(integerNumber, 1));
		return newRational;
	}

	public Rational substract(int integerNumber) {
		Rational newRational = operation(SUBSTRACT, new Rational(integerNumber, 1));
		return newRational;
	}

	public Rational multiply(int integerNumber) {
		Rational newRational = operation(MULTIPLY, new Rational(integerNumber, 1));
		return newRational;
	}

	public Rational divide(int integerNumber) {
		Rational newRational = operation(DIVIDE, new Rational(integerNumber, 1));
		return newRational;
	}

	private Rational operation(int operation, Rational rational) {
		int nok = nok(this.denominator, rational.denominator);
		int remainder = remainder(nok, this.denominator);
		int remainderR = remainder(nok, rational.denominator);
		int newNominator = 0;
		Rational newRational = null;

		switch (operation) {
		case 0:
			newNominator = remainder * this.nominator + remainderR * rational.nominator;
			newRational = new Rational(newNominator, nok);
			break;
		case 1:
			newNominator = remainder * this.nominator - remainderR * rational.nominator;
			newRational = new Rational(newNominator, nok);
			break;
		case 2:
			newNominator = this.nominator * rational.nominator;
			newRational = new Rational(newNominator, nok);
			break;
		case 3:
			rational.reciprocal();
			newNominator = this.nominator * rational.nominator;
			int newDenominator = this.denominator * rational.denominator;
			newRational = new Rational(newNominator, newDenominator);
			break;
		}
		return newRational;
	}

	private int remainder(int nok, int den) {
		int remaind = nok / den;
		return remaind;
	}

	private int nod(int n, int d) {
		if (d == 0)
			return n;
		else
			return nod(d, n % d);
	}

	private int nok(int den1, int den2) {
		int multiplyDenominators = den1 * den2;
		return Math.abs(multiplyDenominators) / nod(den1, den2);
	}

}
