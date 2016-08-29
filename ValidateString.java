package guvi.player;

import java.util.Scanner;

public class ValidateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the string");
String a=s.next();
s.close();
int c1=0;
int c2=0;
int c3=0;
for(int i=0;i<a.length();i++){
	if(a.charAt(i)=='.'){
		c2++;
	}
	else if(Character.isAlphabetic(a.charAt(i)) && (a.charAt(i)!='e') && a.charAt(i)!='E'){
		c3++;
	}
	else{
		c1++;
	}
}
if(c2<=1 && c3==0){
	if(a.length()==(c1+c2)){
		System.out.println("Valid string");
	}
}
else{
	System.out.println("Not valid string");
}
}

}
