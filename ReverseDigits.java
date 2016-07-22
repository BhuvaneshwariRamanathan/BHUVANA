package guvi;

import java.util.Scanner;

public class ReverseDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to be reversed");
		int a=s.nextInt();
		int reverse=0;
		int temp;
		while(a!=0){
			temp=a%10;
			reverse=(reverse*10)+temp;
			a=a/10;
		}
System.out.println(reverse);
s.close();
	}

}
