package guvi.player;

import java.util.Scanner;

public class IdenticalChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the string");
String a=s.next();
String result="";
s.close();
for(int i=0;i<a.length();i++){
	if(i<a.length()-1){
	if(a.charAt(i)==a.charAt(i+1)){
		result=result+a.charAt(i)+""+"*";
	}
	else{
		result=result+a.charAt(i);
	}
	}
	else{
		result=result+a.charAt(i);
	}
}
System.out.println(result);
	}

}
