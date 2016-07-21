package guvi;

import java.util.Scanner;

public class Fibonoci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the range\n");
int a=scanner.nextInt();
int f1=0,f2=1,f3=0;
System.out.println("The fibonoci series");
System.out.println(f1);
System.out.println(f2);
for(int i=0;i<a-2;i++){
	f3=f1+f2;
	f1=f2;
	f2=f3;
	System.out.println(f3);
}
scanner.close();}}