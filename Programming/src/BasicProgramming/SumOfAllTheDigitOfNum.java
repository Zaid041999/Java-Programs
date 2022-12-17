package BasicProgramming;
//WAP to print sum of all the digits in a number

//182= 1+8+2=11

//15
public class SumOfAllTheDigitOfNum {

	public static void main(String[] args) {
		int n = 182;
		int sum = 0;
		while (n != 0) {
			int d = n % 10;
			sum = sum + d;
			n = n / 10;
		}
		System.out.println(sum);

	}

}
