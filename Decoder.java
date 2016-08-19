package guvi;

import java.util.Scanner;

public class Decoder {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string");
	String a=s.next();
	int indexOfx = 0;
	int num = 0;
	char code = 0;
	s.close();
	if(a.contains("x")){
		indexOfx=a.indexOf('x');
		num=Integer.parseInt(a.substring(indexOfx-1,indexOfx));
		System.out.println(num);
		code=a.charAt((indexOfx)+1);
	}
	String decode="";
	String mid="";
	for(int i=0;i<num;i++){
		mid=mid+Character.toString(code);
	}
	String front=a.substring(0,indexOfx-1);
	String end=a.substring(indexOfx+2);
	decode=front+mid+end;
	System.out.println(decode);
	
}
}
