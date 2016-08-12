package guvi;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the to be swaped");
int a=s.nextInt();
int b=s.nextInt();
int t=0;
t=b;
b=a;
a=t;
System.out.println(a);
System.out.println(b);
	}

}
