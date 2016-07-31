package guvi;

import java.util.Scanner;

public class ReverseWordOfString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the string to reverse the order of the words");
String a=s.nextLine();
StringBuffer a1=new StringBuffer(a);
a1.reverse();
//System.out.println(a);
System.out.println(a1);
String a2=new String(a1);
String[] word=a2.split(" ");
StringBuffer[] word2=new StringBuffer[word.length];
String reverse="";
for(int i=0;i<word.length;i++){
	word2[i]=new StringBuffer(word[i]);
	word2[i].reverse();
	reverse+=new String(word2[i])+" ";
}reverse.trim();
System.out.println(reverse);
	}

}
