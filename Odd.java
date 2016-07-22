package guvi;

import java.util.Scanner;

public class Odd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the range");
int a=s.nextInt();
int b=s.nextInt();
for(int i=a;i<=b;i++){
	if(i%2==0){
		continue;
	}
	else{
		System.out.println(i+" ");
	}
}
	}

}
