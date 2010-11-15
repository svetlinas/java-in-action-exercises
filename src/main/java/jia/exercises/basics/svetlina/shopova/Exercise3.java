package jia.exercises.basics.svetlina.shopova;

public class Exercise3 {

	private static boolean canItBeDividedBy3(int number){
		if(number % 3 == 0){
			return true;
		}
		return false;
	}
	
	private static boolean canItBeDividedBy5(int number){
		if(number % 5 == 0){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {

		int sum = 0;

		// we are sure that 1 and 2 do not divide 3 and 5 so we begin from 3
		for (int i = 3; i <= 1000; i++) {
			if (canItBeDividedBy3(i) && canItBeDividedBy5(i)) {
				sum += i;
				// System.out.println(sum);
			}
		}
		System.out.println(sum);
	}
}
