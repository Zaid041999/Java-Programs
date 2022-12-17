package BasicProgramming;

public class Niven {

	public static void main(String[] args) {
		int n = 27;
		int temp = n;
		int sum = 0;
		while(n!=0) {
			int d = n % 10;
			sum = sum + d;
			n = n /10;
			
		}
		if (temp % sum == 0) {
			System.out.println("It is a Niven num");
		}
		else {
			System.out.println("Not a Niven num");
		}
	}

}
//27 = 2 +7 = 9  27/9 divisible 
//15 = 1 +5 = 6    15/6 not divisible
