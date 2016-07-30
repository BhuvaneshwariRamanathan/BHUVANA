package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class LeastNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int a=s.nextInt();
int b[]=new int[Integer.toString(a).length()];
int i=0;
while(a!=0){
	b[i]=a%10;
	i++;
	a=a/10;
}
Arrays.sort(b);
System.out.println("Enter the number of digits to be deleted");
int del=s.nextInt();
for(int j=0;j<i-del;j++){
	System.out.print(b[j]);
}s.close();
	}

}
