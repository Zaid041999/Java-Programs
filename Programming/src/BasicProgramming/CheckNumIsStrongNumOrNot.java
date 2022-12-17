package BasicProgramming;

public class CheckNumIsStrongNumOrNot {

	public static void main(String[] args) {
		int n = 145;
		int temp = n;
		int sum = 0;
		
		while(n!=0) {
			int d = n % 10;
			sum = sum + factorial(d);
			n = n/10;
			
		}
		if (temp == sum) {
			System.out.println("Strong Num");
		}else
		{
			System.out.println("Not a strong num");
		}
		

	}
	public static int factorial(int n) {
		int fact = 1;
		for (int i = 1; i<= n ;i++) {
			fact = fact * i;
		}
		return fact;
	}

}
//145    5!= 5x4x3x2x1=125
//4! = 4x3x2x1=24
//1!= 1
//125 + 24 + 1=145   it is a strong num
/*Separate digit
factorial of digit
sum of factorial
compare original and sum
*/