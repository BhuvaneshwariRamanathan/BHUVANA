package guvi.beginner;

import java.util.Scanner;

public class ArmstrongRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the range1");
		int a = s.nextInt();
		System.out.println("Enter the range2");
		int b = s.nextInt();

		s.close();
		for (int i = a; i <= b; i++) {
			int sum = 0;
			int temp = i;
			int len = Integer.toString(i).length();
			while (temp != 0) {
				int re = temp % 10;
				sum = (int) (sum + Math.pow(re, len));
				temp = temp / 10;
			}
			if (sum == i) {
				System.out.println(i);
			} else {
				continue;
			}
		}

	}
}
