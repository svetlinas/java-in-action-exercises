package jia.exercises.basics.svetlina.shopova;

public class SumOfHundredPrime {

	public static boolean isPrime(int digit) {
		int squareDigit = (int) Math.sqrt(digit);
		boolean isP = true;
		if (digit == 2)
			return true;
		else {
			for (int i = 2; i <= squareDigit; i++)
				if (digit % i == 0) {
					isP = false;
					break;
				}
		}
		return isP;
	}

	
	public static void main(String[] args) {
		
		// priemame 4e edinicata ne e estestveno prosto 4islo
		int sum = 0;
		for (int i = 2; i <= 1000; i++) {
			if (isPrime(i)){
				sum += i;
				// System.out.println(sum);
			}
		}
		System.out.println(sum);
	}
}
