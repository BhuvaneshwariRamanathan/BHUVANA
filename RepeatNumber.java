package guvi;

import java.util.Scanner;

public class RepeatNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements stored in array");
		int n = s.nextInt();
		int[] num = new int[n];
		System.out.println("Enter the " + n + " elements ");
		for (int i = 0; i < n; i++) {
			num[i] = s.nextInt();
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (num[i] == num[j] && i!=j) {
					System.out.println(num[i]);
				}
			}

		}

	}
}
