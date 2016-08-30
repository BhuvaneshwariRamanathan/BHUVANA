package guvi.player;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int a=s.nextInt();
s.close();
int sq=a*a;
if(sq<=9 && a<=9){
	if(sq==1)
	System.out.println("The given number is a happy number");
	else{
		System.out.println("The given number is unhappy number");
	}
}
else{
	
	int sum=a;
	int sq1=0;
	int index = 0;
	int inst=sq;
	while(sum>9){
     inst=sum;
	while(inst!=0){
		int temp=inst%10;
		sq1=sq1+(temp*temp);
		inst=inst/10;
	}
	if(sq1<=9){
		index=sq1;
		System.out.println(index);
		break;
	}
	else{
		sum=sq1;
		sq1=0;
	} 
	}
	if(index==1){
		System.out.println("The given number is happy number");
	}
	else{
		System.out.println("The given number is unhappy number");
	}
}
}

}
