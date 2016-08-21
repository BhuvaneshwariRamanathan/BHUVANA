package guvi.beginner;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int a=s.nextInt();
int len=Integer.toString(a).length();
int temp=a;
int sum=0;
s.close();
while(temp!=0){
	int re=temp%10;
	sum=(int) (sum+Math.pow(re, len));
	temp=temp/10;
}
if(sum==a){
	System.out.println("The given number is armstrong number");
}
else{
	System.out.println("The given number is not a armstrong number");
}
	
	
	}
}
