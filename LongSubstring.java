package guvi;
import java.util.Scanner;
public class LongSubstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String a = s.next();
		String[] sub = new String[15];
		int k = 0;
		s.close();
		for (int i = 0; i < a.length(); i++) {
			for (int j = i + 1; j <= a.length(); j++) {
				sub[k] = a.substring(i, j);
				// System.out.println(sub[k]);
				k++;
			}
		}

		String[] su = new String[k];
		int t = 0;
		for (int j = 0; j < k; j++) {
			if (a.compareTo(sub[j]) < 0) {
				su[t] = sub[j];
				// System.out.println(su[t]);
				t++;
			}
		}
		int len = 0;
		String ans = "";
		for (int l = 0; l < t; l++) {
			if (len < su[l].length()) {
				len = su[l].length();
				ans = su[l];
			}
		}

		System.out.println(len);
		System.out.println(ans);
	}

}
