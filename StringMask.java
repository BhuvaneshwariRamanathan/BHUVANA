package guvi.player;

import java.util.Scanner;

public class StringMask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the string");
String input=s.nextLine();
System.out.println("Enter the mask");
String mask=s.nextLine();
s.close();
for(int i=0;i<mask.length();i++){
	for(int j=0;j<input.length();j++){
		//System.out.println(input.charAt(j));
		if(mask.charAt(i)==input.charAt(j)){
			//System.out.println(input.charAt(j));
			input=input.replace(input.charAt(j)+"", "");
			break;
		}
	}
}
System.out.println(input);
	}

}
