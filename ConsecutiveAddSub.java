package guvi;

import java.util.Scanner;

public class ConsecutiveAddSub {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the num");
	int num=s.nextInt();
	int l=0;
	int odd[]=new int[(num/2)+1];
	s.close();
	for(int i=0;i<=num;i++){
		if(i%2==1){
			odd[l]=i;
			l++;
		}
	}
	int result=0;
	for(int k=0;k<l-1;k++){
		if(k%2==0){
			odd[k+1]=odd[k]+odd[k+1];
		//	System.out.println(odd[k+1]);
		}
		else if(k%2==1){
			odd[k+1]=odd[k]-odd[k+1];
			//System.out.println(odd[k+1]);
		}
		result=odd[k+1];
	//	System.out.println(k);
	}
	System.out.println(result);
}
}
