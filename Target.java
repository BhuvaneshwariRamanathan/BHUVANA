package guvi;

import java.util.Scanner;

public class Target {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = s.nextInt();
		int t = 0;
		int[] arrNum = new int[size];
		for (int i = 0; i < size; i++) {
			arrNum[t] = s.nextInt();
			t++;
		}
		System.out.println("Enter the target");
		int target = s.nextInt();
		s.close();
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (target == (arrNum[i] + arrNum[j])) {
					System.out.println("the target is the sum of " + arrNum[i]
							+ " and " + arrNum[j]);
					break;
				} else {
					continue;
				}
			}
		}

	}
}
