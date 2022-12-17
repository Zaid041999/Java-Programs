package NumConversion;

public class BinaryToDecimal {
	public static void main(String[] args) {
		int n =1100;
		int sum = 0;
		int p = 0;
		while(n!=0) {
			int d = n%10;
			sum = sum + d * pow(2,p++);
			n=n/10;
			}
		System.out.println(sum);

	}
	public static int pow(int n,int p)
	{
		int res =1 ;
		for (int i =1 ;i<= p; i++) {
			res = res * n;
			
		}
		return res;
	}
}



//1100 =  1*2^3+1*2^2 +0*2^1 +0*2^0 =12
