package guvi.player;

import java.util.Scanner;

public class MaxRepeatWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the string");
String sen=s.nextLine();
s.close();
String word[]=sen.split(" ");
int count[]=new int[word.length];
int len=0;
String ans="";
for(int i=0;i<word.length;i++){
	count[i]=repeatCheck(word[i]);
	if(len<count[i]){
		len=count[i];
		ans=word[i];
	}
}
System.out.println(ans+" "+len);

	}
public static int repeatCheck(String a){
	int count=0;
	for(int i=0;i<a.length();i++){
		if(a.indexOf(a.charAt(i))==a.lastIndexOf(a.charAt(i))){
			continue;
		}
		else{
			count++;
			a=a.replace(a.charAt(i)+"","");
		}
	}
	return count;
}
}
