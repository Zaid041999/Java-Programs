package BasicProgramming;

public class NumIsSpecialNumOrNot {

	public static void main(String[] args) {
	int n = 19;
	int temp = n;
	int sum = 0;
	int prod = 1;
	
	while(n!=0) {
		int d =n%10;
		
		prod = prod * d;
		sum = sum + d;
		n = n /10;
		
		
	}
	sum = sum + prod;
	if (temp == sum) {
		System.out.println("Special num");
	}else {
		System.out.println("Not a special num");
	}
	}

}
//19 = (1+9) + (1*9)=19
//original num = sum
