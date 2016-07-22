package guvi;

import java.util.Scanner;

public class NumberOfDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
	int a=s.nextInt();
	int len = 0;
	while(a!=0){
		int temp=a%10;
        len++;
		a=a/10;
	}
	System.out.println("The number of digits " +len);
	s.close();
	}

}
