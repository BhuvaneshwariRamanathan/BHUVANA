package guvi;

import java.util.Scanner;

public class SwapEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the string");
String a=s.next();
String result="";
s.close();
if(a.length()%2==0 || a.length()%2==1){
for(int i=0;i<a.length()-1;i+=2){
	StringBuffer swap=new StringBuffer(a.substring(i, i+2));
	swap.reverse();
	result=result+new String(swap);
}
if(a.length()%2==1){
	result=result+a.charAt(a.length()-1);
}
}
System.out.println(result);
	}

}
