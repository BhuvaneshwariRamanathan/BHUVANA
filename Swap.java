package guvi;

import java.util.Scanner;

public class Swap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int t;
t=b;
b=a;
a=t;
System.out.println("After swap " +a +" "+b);
	}

}
