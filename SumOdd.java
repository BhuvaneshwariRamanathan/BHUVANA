package guvi;

import java.util.Scanner;

public class SumOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int sum=0;
		for(int i=0;i<=a;i++ ){
			if(i%2==1){
				sum+=i;
			}
			else{
				continue;
			}
		}
		System.out.println(sum);

	}

}
