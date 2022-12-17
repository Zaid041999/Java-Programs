package NumConversion;

public class OctalToBinary {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 14;
		int sum =0;
		int p = 0;
		while(n!=0) {
			int d = n% 10;
			sum = sum + d * pow(8,p++);
			n = n/10;
		}
		//System.out.println(sum);
		//decimal to binary
	/*	n = sum ;
		String bin ="";
		while(n!=0)
		{
			int rem = n %2;
			bin  = rem + bin;
			n =n/2;
		}
		System.out.println(bin);
		*/
		System.out.println(bin(sum));
	}
	public static int pow(int n ,int p)
	{
		int res = 1;
		for(int i=1;i<=p;i++) {
			res =res * n;
		}
		return res;
	}
	//Decimal to binary
	public static String bin(int n)
	{
		String bin = "";
		while(n!=0)
		{
			int rem = n % 2;
			bin = rem + bin ;
			n = n/ 2;
			
		}
		return bin;
	}
}
