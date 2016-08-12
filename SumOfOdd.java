package guvi;

public class SumOfOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum=0;
int sum1=0;
for(int i=1;i<=15;i++){
	sum=sum+i;
}
for(int j=15;j<=45;j++){
	if(j%2==0){
		continue;
	}
	else{
		sum1=sum1+j;
	}
}
System.out.println(sum);
System.out.println(sum1);
	}

}
