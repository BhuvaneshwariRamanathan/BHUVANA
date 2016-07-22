package guvi;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number;
		int result = 1;
		System.out.println("Enter the number ");
		number = scanner.nextInt();

		for (int i = 1; i <= number; i++) {
			result = result * i;
		}
		System.out.println("The factorial of the given number:" + result);
		scanner.close();
	}

}
