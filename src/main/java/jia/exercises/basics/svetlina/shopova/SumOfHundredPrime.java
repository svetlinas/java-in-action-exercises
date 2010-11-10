package jia.exercises.basics.svetlina.shopova;

public class SumOfHundredPrime {

	public static boolean isPrime(int a) {
		int b = (int) Math.sqrt(a);
		boolean isP = true;
		if (a == 2)
			return true;
		else {
			for (int i = 2; i <= b; i++)
				if (a % i == 0) {
					isP = false;
					break;
				}
		}
		return isP;
	}

	
	public static void main(String[] args) {
		
		// priemame 4e edinicata e estestveno prosto 4islo
		int sum = 1;
		for (int i = 2; i <= 1000; i++) {
			if (isPrime(i)){
				sum += i;
				// System.out.println(sum);
			}
		}
		System.out.println(sum);
	}
}
