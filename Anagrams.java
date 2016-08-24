package guvi.player;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the strings");
String a=s.nextLine();
String b=s.nextLine();
a=a.replaceAll(" ", "");
b=b.replaceAll(" ", "");
s.close();
char arr1[]=a.toCharArray();
char arr2[]=b.toCharArray();
Arrays.sort(arr1);
Arrays.sort(arr2);
boolean status;
status=Arrays.equals(arr1, arr2);
if(status){
	System.out.println("The string are anagrams");
}
else{
	System.out.println("The strings are not anagrams");
}
	}
}
