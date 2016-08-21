package guvi2;

import java.util.Scanner;

public class BinaryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the array size");
	int size=s.nextInt();
	System.out.println("Enter the numbers");
	int num[]=new int[size];
	String binary[]=new String[size];
	for(int i=0;i<size;i++){
		num[i]=s.nextInt();
		binary[i]=Integer.toBinaryString(num[i]);
	}
	s.close();
    int count[]=new int[size];
    for(int i=0;i<size;i++){
    	count[i]=0;
    	for(int j=0;j<binary[i].length();j++){
    		if(binary[i].charAt(j)=='1'){
    			count[i]++;
    		}
    	}
    //	System.out.println(binary[i]+" "+num[i]+" "+count[i]);
    }
    for(int i=0;i<size;i++){
    	for(int j=i+1;j<size;j++){
    		if(count[i]<count[j]){
    			int temp=num[j];
    			num[j]=num[i];
    			num[i]=temp;
    		}
    		else if(count[i]==count[j]){
    			if(num[i]<num[j]){
    				int temp=num[j];
        			num[j]=num[i];
        			num[i]=temp;
    			}
    		}
    	}
    }
    int result[]=new int[size];
    for(int i=0;i<size;i++){
    	//result[i]=Integer.parseInt(binary[i]);
    	System.out.println(num[i]);
    }

}

}
