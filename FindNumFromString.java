package guvi;

import java.util.Scanner;

public class FindNumFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the string");
try{
String a=s.next();
int num=Integer.parseInt(a);
if(num<0){
	num=-num;
System.out.println(num);
}else{
	System.out.println(-1);
}
s.close();
}
catch(NumberFormatException e){
	System.out.println(-1);
}
	}

}
