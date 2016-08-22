package guvi.hunter;

import java.util.Scanner;

public class NumberOfTwos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int num=s.nextInt();
int count=0;
s.close();
for(int i=1;i<=num;i++){
	int temp=i;
	while(temp!=0){
		int tem=temp%10;
		if(tem==2){
			count++;
		}
		temp=temp/10;
	}
}
System.out.println(count);
	}

}
