package jia.exercises.basics.svetlina.shopova;

public class Rational {
	// It's better for the realization the class to be named Rational and not Exercise6 ;)
	
	private static final int ADD = 0;
	private static final int SUBSTRACT = 1;
	private static final int MULTIPLY = 2;
	private static final int DIVIDE = 3;

	private int nominator;
	private int denominator;

	public Rational(int nominator, int dominator) {
		if (dominator == 0)
			throw new RuntimeException("Dominator must not be zero!");
		int nod = nod(nominator, dominator);
		this.nominator = nominator / nod;
		this.denominator = dominator / nod;
	}

	public Rational reciprocal() {
		int temp = this.denominator;
		this.denominator = this.nominator;
		this.nominator = temp;
		return this;
	}

	@Override
	public String toString() {
		if (denominator == 1)
			return nominator + "";
		else
			return nominator + "/" + denominator;
	}

	public Rational add(Rational rational) {
		Rational newRational = operation(ADD, rational);
		return newRational;
	}

	public Rational subtract(Rational rational) {
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

	public Rational subtract(int integerNumber) {
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

		switch (operation) {
		case 0:
			newNominator = remainder * this.nominator + remainderR * rational.nominator;
		case 1:
			newNominator = remainder * this.nominator - remainderR * rational.nominator;
		case 2:
			newNominator = this.nominator * rational.nominator;
		case 3:
			rational.reciprocal();
			operation(MULTIPLY, rational);
		}
		return new Rational(newNominator, nok);
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
