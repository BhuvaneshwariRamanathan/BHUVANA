package guvi;

import java.util.Scanner;

public class Vowel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char c=s.nextLine().charAt(0);
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'|| c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
			System.out.println("The given character is vowel");
		}
		else
		{
			System.out.println("The given character is a consonant");
		}

	}

}
