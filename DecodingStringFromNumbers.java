package guvi;

import java.util.ArrayList;

public class DecodingStringFromNumbers {
	public static int output2;

	public static void main(String[] args) {
		ArrayList<String> output1 = decodeStrings(123);
		System.out.println(output1);
		System.out.println("The number of iterations" +output2);
	}

	// check your test cases here

	public static ArrayList<String> decodeStrings(int input1) {
		String st = String.valueOf(input1);
		StringBuffer ss = new StringBuffer(st);
		ss.reverse();
		int val = Integer.parseInt(ss.toString());
		// System.out.println(val);
		//First declare variable here
		int iter1 = 0;
		int iter2 = 0;
		int iter3 = 0;
		String res1 = "";
		String res2 = "";
		String res3 = "";
		char[] arr1 = new char[st.length()];
		char[] arr2 = new char[st.length()];
		// first iteration- only single digits(reverse string)
		int k = 0;
		while (val != 0) {
			int temp = val % 10;
			arr1[k] = (char) (temp + 96);
			k++;
			res1 = res1 + ((char) (temp + 96));
			iter1++;
			val = val / 10;
		}
		// System.out.println(res1);
		// System.out.println(iter1);
		//Second iteration- only two digits (for loop)
		String st1 = String.valueOf(input1);
		int l = 0;
		for (int i = 0; i < st1.length() - 1; i++) {
			String inst = st1.substring(i, i + 2);
			int tem = Integer.parseInt(inst);
			iter2++;
			if (tem <= 26) {
				arr2[l] = (char) (tem + 96);
				l++;
				res2 = res2 + ((char) (tem + 96));
			} else {
				int sum = 0;
				while (tem != 0) {
					sum = sum + (tem % 10);
					tem = tem / 10;
				}
				arr2[l] = (char) (tem + 96);
				l++;
				res2 = res2 + ((char) (sum + 96));
			}
		}
		// System.out.println(res2);
		// System.out.println(iter2);
		//Third starting - three substring front,end,middle -ans3[0] & ans3[st.length()-2] separately calculated-remaining for loop
		String front[] = new String[st.length()];
		String middle[] = new String[st.length()];
		String end[] = new String[st.length()];
		String fro[] = new String[st.length()];
		String mid[] = new String[st.length()];
		String en[] = new String[st.length()];
		String ans3[] = new String[st.length()];
		String substr[] = new String[st.length()];
		//ans3[0]
		if (st.length() == 2) {
			res3 = res3 + (char) (Integer.parseInt(st.substring(0)) + 96);
		} else {
			ans3[0] = "";
			int vl = Integer.parseInt(st.substring(0, 2));
			front[0] = "";
			if (vl <= 26) {
				front[0] = front[0] + (char) (vl + 96);
			} else {
				int s1 = 0;
				while (vl != 0) {
					s1 = s1 + (vl % 10);
					vl = vl / 10;
				}
				front[0] = front[0] + (char) (s1 + 96);
			}
			StringBuffer sss = new StringBuffer(st.substring(2));
			sss.reverse();
			int var = Integer.parseInt(new String(sss));
			end[0] = "";
			while (var != 0) {
				int vaa = var % 10;
				end[0] = end[0] + (char) (vaa + 96);
				var = var / 10;
			}
			ans3[0] = front[0] + end[0];
			// System.out.println(front[0]);
			// System.out.println(ans3[0]);
		}
		// loop for remaining
		int last = 0;
		for (int i = 1; i < st.length() - 1; i++) {
			iter3++;
			ans3[i] = "";
			middle[i] = "";
			// last substring in third iteration
			if (i < st.length() - 2) {
				middle[i] = st.substring(i, i + 2);
				front[i] = st.substring(0, i);
				end[i] = st.substring(i + 2);
				// System.out.println(front[i] + " " + middle[i] + " " +
				// end[i]);
				last = Integer.parseInt(middle[i]);
				// System.out.println(last);
				int s1 = 0;
				mid[i] = "";
				if (last <= 26) {
					mid[i] = mid[i] + (char) (last + 96);
				} else {

					while (last != 0) {
						s1 = s1 + (last % 10);
						last = last / 10;
					}
					mid[i] = mid[i] + (char) (s1 + 96);
					// System.out.println(mid[i]);
				}
				// System.out.println(mid[i]);
				
				StringBuffer sn = new StringBuffer(front[i]);
				sn.reverse();
				fro[i] = "";
				int first = Integer.parseInt(new String(sn));
				while (first != 0) {
					int cnt = first % 10;
					fro[i] = fro[i] + (char) (cnt + 96);
					first = first / 10;
				}
				// System.out.println(fro[i]);
				StringBuffer sn1 = new StringBuffer(end[i]);
				sn1.reverse();
				en[i] = "";
				int hh = Integer.parseInt(new String(sn1));
				while (hh != 0) {
					int cnt = hh % 10;
					en[i] = en[i] + (char) (cnt + 96);
					hh = hh / 10;
				}
				// System.out.println(en[i]);
				ans3[i] = fro[i] + mid[i] + en[i];

				// System.out.println(ans3[i]);
			}

			else if (i == st.length() - 2) {
				middle[i] = st.substring(st.length() - 2);
				front[i] = st.substring(0, st.length() - 2);
				int lat = Integer.parseInt(middle[i]);
				int s1 = 0;
				mid[i] = "";
				if (lat <= 26) {
					mid[i] = mid[i] + (char) (lat + 96);
				} else {

					while (lat != 0) {
						s1 = s1 + (lat % 10);
						lat = lat / 10;
					}
					mid[i] = mid[i] + (char) (s1 + 96);
					// System.out.println(mid[i]);

				}
				StringBuffer sss = new StringBuffer(front[i]);
				sss.reverse();
				int var = Integer.parseInt(new String(sss));
				fro[i] = "";
				while (var != 0) {
					int vaa = var % 10;
					fro[i] = fro[i] + (char) (vaa + 96);
					var = var / 10;
				}
				ans3[i] = fro[i] + mid[i];

				// System.out.println(ans3[i]);

			}
			// System.out.println(ans3[i]);
		}
		res3 = res3 + ans3[0];
		//concat with case options
		for (int i = 1; i < st.length() - 1; i++) {
			if (i % 2 == 1) {
				res3 = res3 + ans3[i].toUpperCase();
			} else {
				res3 = res3 + ans3[i];
			}
		}
		// System.out.println(res3);
		// System.out.println(iter3+1);
		// Assigning output
		output2 = iter1 + iter2 + (iter3 + 1);
		ArrayList<String> out = new ArrayList<String>();
		out.add(res1);
		out.add(res2);
		out.add(res3);
		System.out.println("The number of count of string from numbers " +out.size());
		return out;

	}
}
