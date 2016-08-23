package guvi.hunter;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = s.nextLine();
		String word[] = input.split(" ");
		char key = 0;
		String result = "";
		for (int i = 0; i < word.length; i++) {

			int ch = 1;
			while (ch >= 0) {
				if (word[i].length() - ch < 0) {
					break;
				}
				if (Character.isAlphabetic(word[i].charAt(word[i].length() - ch))) {
					key = word[i].charAt(word[i].length() - ch);
					break;
				} else {
					ch++;
				}
			}
			System.out.println(key);
			char temp[] = word[i].toCharArray();
			int encrypt = word[i].length() - ch;
			for (int j = 0; (j < encrypt) || (encrypt == -1) || (encrypt == 0); j++) {
				if (encrypt > 0) {
					int key1;
					if (Character.isUpperCase(key)) {
						key1 = (key - 64);
					} else {
						key1 = (key - 96);
					}
					// System.out.println(key1);
					if (Character.isUpperCase(temp[j])) {
						temp[j] = (char) (temp[j] - key1);
						if ((int) temp[j] < (int) 'A') {
							temp[j] = (char) (temp[j] + 26);
						} else if ((int) temp[j] > (int) 'Z') {
							temp[j] = (char) (temp[j] - 26);
						}
					} else if (Character.isLowerCase(temp[j])) {
						temp[j] = (char) (temp[j] - key1);
						if ((int) temp[j] < (int) 'a') {
							temp[j] = (char) (temp[j] + 26);
						} else if ((int) temp[j] > (int) 'z') {
							temp[j] = (char) (temp[j] - 26);
						}
					}
				} else {
					String st = new String(temp);
					result = result +" "+ st;
					break;
				}
				if (j == encrypt - 1) {
					String st = new String(temp);
					result = result +" "+ st;
				}
			
		}
	}s.close();
		result=result.trim();
		System.out.println(result);
	}
}
