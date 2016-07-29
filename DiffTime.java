package guvi;

import java.util.Scanner;

public class DiffTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the time in HH & MM format");
		int h1=s.nextInt();
		int m1=s.nextInt();
		int t1=(h1*60)+m1;
		System.out.println("Enter the time in HH & MM format");
		int h2=s.nextInt();
		int m2=s.nextInt();
		int t2=(h2*60)+m2;
		int diff=(t1-t2);
		System.out.println("The difference in time " +diff);
		s.close();
		

	}

}
