package guvi;

import java.util.Scanner;

public class TwoDiffVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the string");
String a=s.next();
StringBuffer ab=new StringBuffer(a);
String aRev=new String(ab.reverse());
boolean status=false;
if(a.equals(aRev)){
	status=true;
}
a=a.toLowerCase();
boolean st = true;
int l=0;
s.close();
char c[]=new char[20];
for(int i=0;i<a.length();i++){
	if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
		c[l]=a.charAt(i);
		l++;
		}
}
for(int k=0;k<l-1;k++){
	if(c[k]==c[k+1]){
		st=false;
	}
}

if(status && st){
	System.out.println(true);
}
else{
	System.out.println(false);
}
	}

}
