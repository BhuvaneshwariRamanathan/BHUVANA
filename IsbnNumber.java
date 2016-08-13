package guvi;

import java.util.Scanner;

public class IsbnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = s.nextInt();
		s.close();
		int i = 1;
		int len = 0;
		int sum = 0;
		while (a != 0) {
			int temp = a % 10;
			sum = sum + (temp * i);
			i++;
			len++;
			a = a / 10;
		}
		if (len == 10) {
			if (sum % 11 == 0) {
				System.out.println("It is a ISBN Number");
			} else {
				System.out.println("It is not a ISBN Number");
			}
		} else {
			System.out.println("It is not a ISBN Number");
		}

	}

}
