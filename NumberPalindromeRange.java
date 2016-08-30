package guvi.player;

import java.util.Scanner;

public class NumberPalindromeRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the range");
		int r1 = s.nextInt();
		int r2 = s.nextInt();
		s.close();
		int sum = 0;
		for (int i = r1; i <= r2; i++) {
			if (palindrome(i)) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

	public static boolean palindrome(int a) {
		String s = String.valueOf(a);
		StringBuffer s1 = new StringBuffer(s);
		String s2 = new String(s1.reverse());
		if (s.equals(s2)) {
			return true;
		} else {
			return false;
		}
	}

}
