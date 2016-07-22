package guvi;

import java.util.Scanner;

public class Prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int count=0;
		System.out.println("Enter the range");
		int a=s.nextInt();
		int b=s.nextInt();
		for(int number=a;number<=b;number++){
		for (int i = 2; i < number; i++) {
			if ((number % i) == 0)
				count++;

		}
		if (count >= 1)
			System.out.println(number+" ");
		else
	     continue;
	}
	}}


