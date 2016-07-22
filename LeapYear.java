package guvi;

import java.util.Scanner;

public class LeapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the year");
int a=s.nextInt();

if(( a%4==0 || a%400==0) && (a%100 != 0)){
	System.out.println("The given year is leap year");
	
}
else
	System.out.println("The given year is not a leap year");
s.close();
	}

}
