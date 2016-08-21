package guvi2;

import java.util.Scanner;

public class SubstringNonPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner s=new Scanner(System.in);
 System.out.println("Enter the string");
 String a=s.next();
 int len=a.length();
 String substring[]=new String[len*((len+1)/2)];
 int k=0;
 for(int i=0;i<len;i++){
	 for(int j=i+1;j<len;j++){
		 substring[k] = a.substring(i, j + 1);
		//	System.out.println(substring[k]);
			k++;
		}
	 }
 String nonPali[]=new String[k];
 s.close();
 int l=0;
 for(int i=0;i<k;i++){
	 StringBuffer rev=new StringBuffer(substring[i]);
	 String rev1=new String(rev.reverse());
	 if(rev1.equals(substring[i])){
		 continue;
	 }
	 else{
		 nonPali[l]=substring[i];
		// System.out.println(nonPali[l]);
		 l++;
		 
	 }
 }
int  le=0;
String ab="";
  for(int i=0;i<l;i++){
	if(le<nonPali[i].length()){
		le=nonPali[i].length();
		ab=nonPali[i];
	}
} 
System.out.println(ab);
System.out.println(le);
 }
}


