package guvi;

import java.util.Scanner;

public class SumOfOddDigit {
	int sum=0;
	public int sumOfOdd(int a){
		int b=a;
		while(b!=0){
			int temp=b%10;
			if(temp%2==1){
				sum=sum+temp;
			}
			b=b/10;
		}
		if(sum%2==0){
			return -1;
		}
		else{
			return 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfOddDigit odd=new SumOfOddDigit();
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int aa=s.nextInt();
int result=odd.sumOfOdd(aa);
System.out.println(result);
	}

}
