package guvi.beginner;

import java.util.Scanner;

public class SpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String a = s.next();

		int sp = 0;
		for (int i = 0; i < a.length(); i++) {
			if (!Character.isAlphabetic(a.charAt(i)) && !Character.isDigit(a.charAt(i))) {
				sp++;
			}
			}
    System.out.println("Special characters " + sp);
	}

}
