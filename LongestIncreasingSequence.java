package guvi;

public class LongestIncreasingSequence {


		public static int output1;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			LongestIncreasingSequence l = new LongestIncreasingSequence();
			int[] arr = new int[] {23,10,18,18,6};
			l.lengthOfSequence(arr);
			System.out.println(output1);
		}

		public static void lengthOfSequence(int[] input) {
			int count = 0;
			int n = 0;
			if (input.length == 0 || input.length == 1) {
				output1 = 0;
			} else {
				for (int i = 0; i < input.length - 1; i++) {
					if ((input[i] < input[i + 1])||(input[i]==input[i+1])) {
						count++;
					} else if (n < count) {
						n = count+1;
						count = 0;
					}
				}
				output1 = n;
			}
		}
	}

