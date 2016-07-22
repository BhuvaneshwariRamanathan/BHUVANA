package guvi;

import java.util.Scanner;

public class Largest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		if (a > b && a > c) {
			System.out.println("The largest number is" + a);
		} else if (b > c && b > a) {
			System.out.println("The largest number is " + b);
		} else
			System.out.println("The largest number is " + c);
		s.close();
	}

}