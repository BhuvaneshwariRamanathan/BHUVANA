package guvi.beginner;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int a=s.nextInt();
String st=a+"";
s.close();
StringBuffer str=new StringBuffer(st);
System.out.println(str.reverse());
	}

}
