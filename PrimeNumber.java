package wipro.assessment;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count=0;
int number;
System.out.println("Enter the number to be checked");
Scanner input=new Scanner(System.in);
number=input.nextInt();
if((number==0)||(number==1))
	System.out.println("The number is neither a prime number nor composite number");
else if(number==2){
	System.out.println("The number is a prime number");
}
else{
	for(int i=2;i<number;i++){
if((number%i)==0)
	count++;
		
	}if(count>=1)
		System.out.println("The given number is not a prime number");
	else
		System.out.println("The given number is a prime number");
	input.close();
	}
	}
}
