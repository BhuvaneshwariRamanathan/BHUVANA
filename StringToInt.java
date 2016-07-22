package guvi;

import java.util.Scanner;

public class StringToInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the number in string format");
String a=s.nextLine();
String c="5417628";
int b=Integer.parseInt(a);
int d=Integer.parseInt(c);
System.out.println(b);
System.out.println(d);
s.close();
	}

}
