package guvi.player;

import java.util.Scanner;

public class SumOfPrimeIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = s.nextInt();
		int num[] = new int[size];
		for (int i = 0; i < size; i++) {
			num[i] = s.nextInt();
		}
		s.close();
		int prime[] = new int[size];
		int k = 0;
		boolean flag = false;
		if (size <= 2) {
			prime[k] = 2;
			k++;
		}
		for (int i = 2; i < size; i++) {
			flag = false;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = true;
				}
        	}
			if (!flag) {
				prime[k] = i;
				k++;
			}
		}
		int sum = 0;
		for (int j = 0; j < k; j++) {
			for (int i = 0; i < size; i++) {
				if (i == prime[j]) {
					sum = sum + num[i];
				}
			}
		}
		System.out.println("sum " +sum);
	}

}
