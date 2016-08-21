package lp;

import java.util.Scanner;

public class SeedOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int num=s.nextInt();
System.out.println("Enter the seed");
int seed=s.nextInt();
int temp=seed;
int remainder[]=new int[10];
int i=0;
while(temp!=0){
	remainder[i]=temp%10;
	System.out.println(remainder[i]);
	i++;
	temp=temp/10;
}
int sum=seed*remainder[0];
for(int l=1;l<i;l++){
	sum=sum*remainder[l];
}
System.out.println(sum);
if(sum==num){
	System.out.println(seed +" is a seed of " +num);
}
else{
	System.out.println("It is not the seed of the given number");
}
}

}
