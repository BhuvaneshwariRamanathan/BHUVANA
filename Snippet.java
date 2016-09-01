package guvi;

public class Snippet {

	public static int output1;

	public static void main(String[] args) {
		userMethod(1234); // Test Cases
		System.out.println(output1); // Check the output value
	}

	public static void userMethod(int input1) {
		// Code here
		// assign the output value at the end
		int a = input1;
		int sum[] = new int[20];
		int temp = 0;
		int sum1 = 0;
		int remainder[] = new int[20];
		int i = 0;
		while (a > 0) {
			remainder[i] = a % 10;
			i++;
			a = a / 10;
		}
		for (int j = i - 1; j >= 0; j--) {
			sum[j] = temp + remainder[j];
			temp = sum[j];
			sum1=sum1+sum[j];
		}
	
		output1 = sum1;
	}
}
