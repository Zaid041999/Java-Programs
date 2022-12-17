package BasicProgramming;

//10
public class SeparateTheDigit {

	public static void main(String[] args) {
		int n = 1234;
		while (n != 0) {
			int rem = n % 10;
			System.out.println(rem);
			n = n / 10;
		}
	}

}
