package BasicProgramming;
//WAP to print all the odd digits in a number
//18257 = 1,5,7 is a odd

//14
public class PrintOddDigitInNum {
	public static void main(String[] args) {
  	int n =135689;
  	while(n!=0) {
  		int d = n% 10;
  		if (d%2==1) {
  			System.out.println(d);
  		}
  		n=n/10;
  	}
	}
}
