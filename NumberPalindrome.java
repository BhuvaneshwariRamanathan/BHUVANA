package guvi;

import java.util.Scanner;

public class NumberPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int a=s.nextInt();
int sum=0;
s.close();
while(a!=0){
	int temp=a%10;
	sum=sum+temp;
	a=a/10;
}int ans=sum;
int rev=0;
while(sum!=0){
	int temp=sum%10;
	rev=(rev*10)+temp;
	sum=sum/10;
}if(ans==rev){
	System.out.println("The sum of the digit is palindrome");
}else{
	System.out.println("The sum of the digit is not a palindrome");
}
	}

}
