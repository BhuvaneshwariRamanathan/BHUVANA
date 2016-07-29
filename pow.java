package guvi;
import java.util.Scanner;


public class pow {
	public static void main(String o[]){
	int n,sum=0;
	int b[] = new int[100];
	int s[]=new int[100];
	int c[]=new int[100];
	
	int num=0,a,j=0;
	int t=1;
	Scanner ac=new Scanner(System.in);
	n=ac.nextInt();
	while(n>0){
		a=n%10;
		b[num]=a;
		n=n/10;
		num++;
	}
	
	for(int i=num-1;i>=0;i--){
	s[j]=b[i];
		
		j++;
		
		
	}for(int i=0;i<j;i++){
		c[i]=1;
		int k=0;
		if(j-1==i){
			
			while(k<s[0]){
				
				c[i]*=s[i];

				++k;
				
			}
			
		}
		else{
	
		while(k<s[i+1]){
			c[i]*=s[i];
	
			k++;
			
		}}
		
	}

	for(int p=0;p<j;p++){
		System.out.println(c[p]);
	}for(int p=0;p<j;p++){
		sum=sum+c[p];
	}
	System.out.println("sum ="+sum);
	
	}
}
