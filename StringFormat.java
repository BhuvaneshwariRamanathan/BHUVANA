package guvi.player;

import java.util.Scanner;

public class StringFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the date in string format dd/mm/yyyy");
String date=s.next();
s.close();
String d[]=date.split("/");
if(Integer.parseInt(d[0])<=31 && Integer.parseInt(d[0])>=1 && Integer.parseInt(d[1])<=12 && Integer.parseInt(d[1])>=1 && Integer.parseInt(d[2])<=2016){
	System.out.println("valid date");
}
else{
	System.out.println("invalid date");
}
	}

}
