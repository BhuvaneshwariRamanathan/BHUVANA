package guvi;

import java.util.Scanner;

public class OctalHexaDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int a=s.nextInt();
System.out.println(Integer.toBinaryString(a));
System.out.println(Integer.toHexString(a));
System.out.println(Integer.toOctalString(a));
	}

}
