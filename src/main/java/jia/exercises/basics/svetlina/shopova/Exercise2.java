package jia.exercises.basics.svetlina.shopova;

public class Exercise2 {
	public static boolean isPrime(int digit) {
		int boundaryNumber = (int) Math.sqrt(digit);
		boolean isPrime = true;
		if (digit == 2) {
			isPrime = true;
		} else {
			for (int i = 2; i <= boundaryNumber; i++)
				if (digit % i == 0) {
					isPrime = false;
					break;
				}
		}
		return isPrime;
	}

	public static void main(String[] args) {

		// 1 is not a prime number
		int sum = 0;
		for (int i = 2; i <= 1000; i++) {
			if (isPrime(i)) {
				sum += i;
				// System.out.println(sum);
			}
		}
		System.out.println(sum);
	}
}
