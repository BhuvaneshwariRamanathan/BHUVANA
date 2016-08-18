package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class Median {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the array size");
	int c=s.nextInt();
	System.out.println("Enter the numbers");
	int num[]=new int[c];
	for(int i=0;i<c;i++){
		num[i]=s.nextInt();
	}
	s.close();
	Arrays.sort(num);
	//Equal length of arrays-middle element
	if(num.length%2==1){
		int mid=num[(num.length/2)];
		System.out.println(mid);
	}
	else{
	int len=num.length/2;
	float middle=(num[len]+num[len-1])/2f;
	System.out.println(middle);
	}
}
}

