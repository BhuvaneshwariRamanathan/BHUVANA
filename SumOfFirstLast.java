package guvi;

import java.util.Scanner;

public class SumOfFirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int a=s.nextInt();
s.close();
String inst=String.valueOf(a);
int first=Integer.parseInt(inst.substring(0,1));
int last=Integer.parseInt(inst.substring(inst.length()-1,inst.length()));
int sum=first+last;
System.out.println(first+" "+last+" "+sum);
	}

}
