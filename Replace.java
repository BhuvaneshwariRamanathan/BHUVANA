package guvi;

import java.util.Scanner;

public class Replace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String a=s.nextLine();
StringBuffer str=new StringBuffer(a);
String rev=new String(str.reverse());
System.out.println(rev);
String replace=rev.replaceAll("[aeiouAEIOU]", "");
System.out.println(replace);
	}

}
