package guvi;

import java.util.Scanner;

public class StringFirstAccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the string");
String a=s.nextLine();
System.out.println("Enter the string to be searched");
String str=s.next();
s.close();
if(a.contains(str)){
	System.out.println(a.indexOf(str));
}
else{
	System.out.println(-1);
}
	}

}
