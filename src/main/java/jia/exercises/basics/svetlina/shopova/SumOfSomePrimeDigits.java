package jia.exercises.basics.svetlina.shopova;

public class SumOfSomePrimeDigits {

	private static boolean is3And5Divider(int digit) {
		if ((digit % 3 == 0) && (digit % 5 == 0)) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {

		int sum = 0;
		
		// nqma osoben smisyl da zapo4vame ot 1 ili 2
		// tyi kato sme sigurni 4e ne delqt na 3 i 5
		for (int i = 3; i <= 1000; i++) {
			if (is3And5Divider(i)) {
				sum += i;
				// System.out.println(sum);
			}
		}
		System.out.println(sum);
	}
}
