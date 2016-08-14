package guvi;

import java.util.Scanner;

public class SquareDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		int sum=0;
		while(num!=0){
			int temp=num%10;
			sum+=temp*temp;
			num=num/10;
		}
		System.out.println(sum);

	}

}
