package guvi;

import java.util.Scanner;

public class NumberCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

if(n==0){
	System.out.println("0 is neither positive nor negative");
}
else if(n<0){
	System.out.println(n +" is the negative number");
}
else if(n>0){
	System.out.println(n +" is the positive number");
}
s.close();
}}


