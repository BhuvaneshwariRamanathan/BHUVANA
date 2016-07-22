package guvi;

import java.util.Scanner;

public class Power {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
		int a=s.nextInt();
		System.out.println("Enter the power");
		int b=s.nextInt();
		int total=1;
		for(int i=1;i<=b;i++){
			total=total*a;
		}
		System.out.println(a +" Power " +b +" is " +total);
		s.close();
	}

}
