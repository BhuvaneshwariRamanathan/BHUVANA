package guvi2;

import java.util.Scanner;

public class LargestDifferenceGap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the array size");
   int size=s.nextInt();
   int num[]=new int[size];
   System.out.println("Enter the numbers");
   for(int i=0;i<size;i++){
	   num[i]=s.nextInt();
   }
   s.close();
   int gap=largestDiffGap(num,size);
   System.out.println(gap);
}

	private static int largestDiffGap(int[] num,int size) {
		// TODO Auto-generated method stub
		int gap[]=new int[size-1];
		for(int i=0;i<size-1;i++){
			gap[i]=num[i]-num[i+1];
		}
		int g=gap[0];
		int diff=num[0];
		for(int i=0;i<size-1;i++){
			if(g<gap[i]){
				g=gap[i];
				diff=num[i];
			}
			else if(a==gap[i]){
				if(diff<num[i]){
					g=gap[i];
					diff=num[i];
				}
			}
		}
		
		return diff;
		
	}

}
