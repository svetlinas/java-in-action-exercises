package jia.exercises.basics.svetlina.shopova;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Exercise1 {

	private static String writeStringToFile(String f, String l, String a,
			String j, String p) {
		Object[] helpArray = { f, l, a, j, p };
		String helper = String.format("%s\t%s\t%s\t%s\t%s%n", helpArray);
		return helper;
	}

	public static void main(String[] args) throws IOException {

		String beginLine = "Employees in the company";
		String firstName = "Firstname";
		String lastName = "Lastname";
		String age = "Age";
		String job = "Position";
		String payment = "Payment";

		Scanner sc = new Scanner(System.in);

		RandomAccessFile accessFile = new RandomAccessFile("exercise1.txt",
				"rw");
		accessFile.seek(accessFile.length());

		if (accessFile.length() == 0) {
			accessFile.writeBytes(String.format("%s%n%n", beginLine));
			accessFile.writeBytes(writeStringToFile(firstName, lastName, age,
					job, payment));
		}
		do {
			firstName = sc.nextLine();
			if (firstName.compareTo("") == 0)
				break;
			lastName = sc.nextLine();
			age = sc.nextLine();
			job = sc.nextLine();
			payment = sc.nextLine();
			accessFile.writeBytes(writeStringToFile(firstName, lastName, age,
					job, payment));
		} while (firstName.compareTo("") != 0);
		accessFile.close();
	}
}