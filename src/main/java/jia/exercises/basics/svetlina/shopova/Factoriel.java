package jia.exercises.basics.svetlina.shopova;

import java.math.BigInteger;

public class Factoriel {

	public static BigInteger fact(int digit) {
		BigInteger factoriel = BigInteger.valueOf(1);
		for (long i = 1; i <= digit; i++) {
			factoriel = factoriel.multiply(BigInteger.valueOf(i));
		}
		return factoriel;
	}

	public static void main(String[] args) {
		BigInteger sum = BigInteger.ZERO;
		BigInteger number = fact(100);
		int numberLength = number.toString().length();
		
		for(int i = 0; i < numberLength; i++){
			sum = sum.add(number.remainder(BigInteger.valueOf(10)));
			// System.out.println(sum.toString());
			number = number.divide(BigInteger.valueOf(10));
			// System.out.println(number.toString());
		}
		
		System.out.println(sum.toString());
	}
}
