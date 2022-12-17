package BasicProgramming;

public class PerfectNumberOrNot {

	public static void main(String[] args) {
		int n = 6;
		int sum = 0;
		for (int i =1 ; i<n;i++) {
			if(n%i==0) {
				sum = sum + i;
			}
		}
		if (sum==n) {
			System.out.println("Perfect num");
		}
		else {
			System.out.println("not a Perfect num");
		}

	}

}
// 6 =     1   +  2     +    3    = 6   is a perfect num
//	   (6%1==0)+(6%2==0)+(6%3==0)
//16 = 1+ 2+4+ 8 =15 not a perfect num
//6 = 1+2 +3=6 perfect num