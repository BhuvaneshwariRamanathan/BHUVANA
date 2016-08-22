package guvi2;

import java.util.Scanner;

public class EmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the EmailId");
		String email = s.next();
		boolean one = true;
		int c1 = 0;
		int c2 = 0;
		char c[] = email.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '@') {
				c1++;
			}
			if (c[i] == '.') {
				c2++;
			}
		}
		if (c1 > 1 || c2 > 1 || email.contains(":")) {
			one = false;
		}
		int index = email.indexOf('@');
		String sub1 = email.substring(0, index);
		String sub2 = email.substring(email.indexOf('.')+1);
		
		String sub3 = email.substring(index+1, email.indexOf('.'));
		System.out.println(sub1+" "+sub2+" "+sub3);
		if (sub2.equals("com") && sub3.length() >= 4 && sub1.length() >= 3 && one) {

			System.out.println("Valid email");

		} else {
			System.out.println("invalid");
		}
	}

}
