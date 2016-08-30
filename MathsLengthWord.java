package guvi.player;

import java.util.Scanner;

public class MathsLengthWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the string");
String a=s.nextLine();
s.close();
String st[]=a.split(" ");
int len[]=new int[st.length];
for(int i=0;i<st.length;i++){
	len[i]=st[i].length();
}
int le=0;
String ans="";
for(int i=0;i<st.length;i++){
	if(le<len[i]){
		le=len[i];
		ans=st[i];
	}
	else if(le==len[i]){
		if(a.indexOf(ans)>a.indexOf(st[i])){
			le=len[i];
			ans=st[i];
		}
	}
}
System.out.println(le +" "+ans);
	}

}
