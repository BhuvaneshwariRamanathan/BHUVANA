package guvi.beginner;

import java.util.Scanner;

public class CharNumSpecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the string");
String a=s.next();
int alpha=0;
int num=0;
int sp=0;
for(int i=0;i<a.length();i++){
	if(Character.isAlphabetic(a.charAt(i))){
		alpha++;
	}
	else if(Character.isDigit(a.charAt(i))){
		num++;
	}
	else{
		sp++;
	}
}
System.out.println("Numbers " +num);
System.out.println("Alphabets "+alpha);
System.out.println("Special characters " +sp);
	}

}
