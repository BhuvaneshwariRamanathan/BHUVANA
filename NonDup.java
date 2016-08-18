package guvi;

import java.util.Scanner;

public class NonDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String a = s.next();
		char nonDup[] = new char[a.length()];
		s.close();
		int flag;
		int k = 0;
		for (int i = 0; i < a.length(); i++) {
			flag = 0;
			for (int j = i + 1; j < a.length(); j++) {
				if (a.charAt(i) == a.charAt(j)) {
					flag = 1;
				}
			}
			if (flag == 0) {
				nonDup[k] = a.charAt(i);
				k++;
			}
		}
		int count[] = new int[k];
		for (int i = 0; i < count.length; i++) {
			count[i] = 0;
			for (int j = 0; j < a.length(); j++) {
				if (nonDup[i] == a.charAt(j)) {
					count[i]++;
				}
			}
		}
		int nonRepeatcount = 0;
		for (int i = 0; i < count.length; i++) {
			if (count[i]==1) {
				nonRepeatcount++;
			}
		}
		System.out.println(nonRepeatcount);
	}

}
