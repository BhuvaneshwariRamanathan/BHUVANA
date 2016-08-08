package guvi;

import java.util.Scanner;

public class ArrayIndex {

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
		s.close();
		for (int i = 0; i < size; i++) {

			if (i == arrNum[i]) {

				System.out.println(arrNum[i] + " ");
			} else {
				continue;
			}
		}

	}

}
