package guvi.player;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of array");
int size=s.nextInt();
int num[]=new int[size];
int numDup[]=new int[size];
System.out.println("Enter the numbers");
for(int i=0;i<size;i++){
	num[i]=s.nextInt();
	numDup[i]=num[i];
}
s.close();
Arrays.sort(numDup);
if(Arrays.equals(num, numDup)){
	System.out.println("The numbers are in sorted");
}
else{
	System.out.println("The numbers are not in sorted order");
}
	}

}
