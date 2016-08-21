package guvi2;

import java.util.Scanner;

public class StringPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the string size");
int size=s.nextInt();
String ar[]=new String[size];
for(int i=0;i<size;i++){
	ar[i]=s.next();
}
s.close();
int c=prefixCheck(ar);
System.out.println(c);
	}
	public static int prefixCheck(String arr[]){
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i].length()>2){
				if(arr[i].startsWith("01")|| arr[i].startsWith("10")){
					count++;
				}
			}
		}
		return count;
	}

}
