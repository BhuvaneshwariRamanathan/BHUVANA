package guvi;

import java.util.ArrayList;

public class NotOfLength {
	public static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NotOfLength length = new NotOfLength();
		ArrayList<String> a = new ArrayList<>();
		a.add("sbsbs");
		a.add("ghgjh");
		a.add("ab");
		System.out.println("Enter second input");
		String ab = "bb";
		length.CountOfString(a, ab);
		System.out.println(count);
	}

	public static void CountOfString(ArrayList<String> a, String ab) {
		// TODO Auto-generated method stub
		int len = ab.length();
		for (int i = 0; i < a.size(); i++) {
			String inst = a.get(i);
			if (len == inst.length()) {
				continue;
			} else {
				count++;
			}
		}

	}

}
