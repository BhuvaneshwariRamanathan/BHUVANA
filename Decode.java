package guvi.hunter;

import java.util.Scanner;

public class Decode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the string");
String a=s.next();
int num[]=new int[10];
s.close();
int k=0;
String result="";
for(int i=0;i<a.length();i++){
	if(Character.isDigit(a.charAt(i))){
		num[k]=a.charAt(i)-48;
		//System.out.println(num[k]);
		
		for(int j=0;j<num[k];j++){
			result=result+a.charAt(i-1);
		}
		k++;
	}
}
System.out.println(result);
	}

}
