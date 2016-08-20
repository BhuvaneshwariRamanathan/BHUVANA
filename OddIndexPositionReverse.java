package guvi;

import java.util.Scanner;

public class OddIndexPositionReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the string");
String a=s.nextLine();
String word[]=a.split(" ");
String result="";
s.close();
StringBuffer words[]=new StringBuffer[word.length];
for(int i=0;i<word.length;i++){
	if(i%2==0){
		result=result+word[i]+" ";
	}
	else{
		words[i]=new StringBuffer(word[i]);
		result=result+new String(words[i].reverse())+" ";
	}
}
result.trim();
System.out.println(result);
	}

}
