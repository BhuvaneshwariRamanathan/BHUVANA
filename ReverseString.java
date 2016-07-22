package guvi;

import java.util.Scanner;

public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the string to be reversed");
String str=s.nextLine();
StringBuffer str1=new StringBuffer(str);
str1.reverse();
String ans=new String(str1);
System.out.println(ans);
s.close();
	}

}
