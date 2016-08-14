package guvi;

import java.util.Scanner;

public class ParseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the string");
String a=s.nextLine();
String parseStr="";
char inst='-';
s.close();
for(int i=a.length()-1;i>=0;i--){
	parseStr=parseStr+a.charAt(i)+inst;
}
System.out.println(parseStr);
	}

}
