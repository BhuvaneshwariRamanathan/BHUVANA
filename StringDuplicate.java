package guvi;

import java.util.Scanner;

public class StringDuplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String a = s.nextLine();
		System.out.println(a);
		int f = 0;
		int k = 0;
		char[] charArr = new char[a.length()];
		for (int i = 0; i < a.length(); i++) {

			for (int j = i + 1; j < a.length(); j++) {
				if (a.charAt(i) == a.charAt(j))
					f = 1;
			}
			if (f == 0) {
				charArr[k] = a.charAt(i);
				System.out.println(charArr[k]);
				k++;
			}
			f = 0;
		}
		System.out.println(charArr);
	}

}
