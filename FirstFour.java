package guvi;

import java.util.Scanner;

public class FirstFour {
	static boolean st;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = s.nextInt();
				int[] num = new int[size];
				for (int i = 0; i < size; i++) {
					num[i] = s.nextInt();
				} 
			System.out.println("Enter the number to be checked");
			int n = s.nextInt();
			firstFourCheck(size, num, n);
			System.out.println(st);
			s.close();
		}

	

	private static void firstFourCheck(int size, int[] num, int n) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (num[i] == n) {
				count++;
			}
			if (i == 3 && count != 0) {
				st = true;
			}
		}
	}
}
