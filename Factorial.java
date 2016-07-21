package guvi;

public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
long output=1;
		if(args.length==0){
	System.out.println("An integer argument is excepted");
}
else {
		int n=Integer.parseInt(args[0]);
        if(n==0 || n==1){
        	output=1;
        }
        else{int i=1;
        	do{
        		output=output*i;
        	i++;
        	}while(i<=n);
        }
}
		System.out.println("The factorial of the given number is " +output);
	}

}
