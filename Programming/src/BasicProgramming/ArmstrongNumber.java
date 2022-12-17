package BasicProgramming;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n = 153;
		int temp = n;
		int sum = 0;
		int count = countDigits(n);
		while (n != 0) {
			int d = n % 10;
			sum = sum + pow(d, count);
			n = n / 10;
		}
		if (sum == temp) {
			System.out.println("Armstrong Number :" + temp);// true
		} else {
			System.out.println("Not a armstrong number ");

		}

	}

	public static int pow(int d, int count) {
		int res = 1;
		for (int i = 1; i <= count; i++) {
			res = res * d;
		}
		return res;
	}

	public static int countDigits(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n = n / 10;
		}
		return count;
	}

}
