package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDescen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of string array");
		int t = s.nextInt();
		String arr[] = new String[t];
		for (int i = 0; i < t; i++) {
			arr[i] = s.next();
		}
		System.out.println("Enter the string to be searched");
		String se = s.next();
		s.close();
		Arrays.sort(arr);
		int flag=0;
		String des[] = new String[t];
		for (int i = 0; i < arr.length; i++) {
			des[i] = arr[t - i - 1];
		//	System.out.println(des[i]);
			if (des[i].equals(se)) {
				flag=1;
				System.out.println(i);
			}
		}
		if(flag==0){
			System.out.println("String not found");
		}
		
	}

}
