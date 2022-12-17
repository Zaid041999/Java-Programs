package BasicProgramming;

//12
public class Palindrome {

	public static void main(String[] args) {
		int n = 121;
		int temp = n;
		int rev = 0;
		while (n != 0) {
			int d = n % 10;
			rev = rev * 10 + d;
			n = n / 10;
		}
		if (temp == rev) {
			System.out.println("Palindrome num");
		} else {
			System.out.println("Not a Palindrome num");
		}
	}

}
//Reverse num equal to original num