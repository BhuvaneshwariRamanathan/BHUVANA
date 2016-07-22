package guvi;

import java.util.Scanner;

public class Alphabet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		char a = s.nextLine().charAt(0);

		if ((a > 96 && a < 122) || (a > 64 && a < 91)) {
			System.out.println("The given character is a alphabet");

		} else {
			System.out.println("The given character is a special character");
		}
	}
}