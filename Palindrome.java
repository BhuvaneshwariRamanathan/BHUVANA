package guvi;

public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=Integer.parseInt(args[0]);
int temp=num;
int sum=0;
while(temp!=0){
	int a=temp%10;
	sum=(sum*10)+a;
	temp=temp/10;
}
if(sum==num){
	System.out.println("The given number is palindrome");
}
else{
	System.out.println("The given number is not a palindrome");
}
	}

}
