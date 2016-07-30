package guvi;

import java.util.Scanner;

public class PowerOfLength {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = s.nextInt();
		int length = 0;
		int temp[] = new int[10];
		int sum[] = new int[10];
		int total=0;
		int b = a;
		int k = 0;
		while (b != 0) {
			temp[length] = b % 10;
			System.out.println(temp[length]);
			length++;
			b = b / 10;

		}
		int i;
		while (k < length) {
			sum[k] = 1;
			i = 0;
			while (i < length) {
				sum[k] = sum[k] * temp[k];
				i++;
			}
			System.out.println(sum[k]);
			k++;
		}
		for(int j=0;j<k;j++){
			total=total+sum[j];
		}
System.out.println(total);
	}

}
