package guvi;

import java.util.Scanner;

public class UniqueInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = s.nextInt();
		int t = 0;
		int[] arrNum = new int[size];
		for (int i = 0; i < size; i++) {
			arrNum[t] = s.nextInt();
			t++;
		}
		s.close();
		int count=0;
		int k=0;
		int[] dup=new int[size];
		for (int i = 0; i < size; i++){
			count=0;
			for(int j=i+1;j<size;j++){
				if(arrNum[i]==arrNum[j]){
					count++;
				}
			}
			if(count==0){
				System.out.println("The unique integer is " +arrNum[i]);
				break;
			}
			
		}
	}

}
