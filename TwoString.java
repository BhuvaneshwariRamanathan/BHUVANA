package guvi;

import java.util.Scanner;

public class TwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String str1 = s.next();
		String str2 = s.next();
		String max = "";
		String min = "";
		String ans = "";
		if (str1.length() == str2.length()) {
			System.out.println(str1.concat(str2));
		} else if (str1.length() > str2.length()) {
			max = str1;
			min = str2;
			ans = ans + max.substring(str1.length() - str2.length()) + min;
			System.out.println(ans);
		} else if (str2.length() > str1.length()) {
			max = str2;
			min = str1;
			ans = ans + max.substring(str2.length() - str1.length()) + min;
			System.out.println(ans);
		}
	}

}
