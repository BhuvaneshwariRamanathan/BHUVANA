package guvi;

import java.util.Scanner;

public class SubString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the first string");
String a=s.nextLine();
System.out.println("Enter the string to be checked as a substring");
String b=s.nextLine();
if(a.contains(b)){
System.out.println("b is a substring of a");
}else{
	System.out.println("b is not a substring");
}
s.close();
	}

}
