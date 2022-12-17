package BasicProgramming;
//13
//WAP to check whether reverse of a num is even or not
public class CheckWhetherTheReverseNumIsEvenOrNot {

	public static void main(String[] args) {
	int n =23;
	int rev  =0;
	while(n!=0) {
		int d = n %10;
		rev = rev *10+d;
		n=n/10;
	}
	if (rev%2==0) {
		System.out.println("Even num");
	}else {
		System.out.println("Not a Even num");
	}

	}

}
