package BasicProgramming;
//3
public class PrimeNumber {

	public static void main(String[] args) {
		int n = 6;
		int count = 0;
		for (int i = 1; i<=n ;i++) {
			if(n%i==0)
			{
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Prime num");
		}else {
			System.out.println("Not a prime num");
		}

	}

}
//prime number means divisible by itself and 1 i.e.count=2
