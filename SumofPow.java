package guvi.hunter;

import java.util.Scanner;

public class SumofPow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int a=s.nextInt();
int len=Integer.toString(a).length();
int remainder[]=new int[len];
int sum=0;
int temp;
int j=0;
s.close();
remainder[0]=0;
while(a!=0){
	 remainder[j]=a%10;
	//System.out.print(remainder[j]);
	j++;
	a=a/10;
}
int rev[]=new int[j];
int l=0;
for(int i=len-1;i>=0;i--){
	rev[l]=remainder[i];
//	System.out.print(rev[l]);
	l++;
}
for(int i=0;i<j;i++){
	int k=0;
	temp=1;
	if(i<j-1){
		while(k<rev[i+1]){
			temp*=rev[i];
			k++;
		}
	}
	else if(i==(j-1)){
		temp=0;
	}
	sum=sum+temp;
}

System.out.println(sum);
}

}
