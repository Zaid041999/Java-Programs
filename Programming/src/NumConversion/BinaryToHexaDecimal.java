package NumConversion;

public class BinaryToHexaDecimal {
	public static void main(String[] args) {
		int n =1100;
		int p = 0;
		int sum = 0;
		while(n!=0) {
			int d = n % 10;
			sum =sum + d * pow(16,p++);
			n =n/10;
		}
		System.out.println(hex(sum));
	}
	public static int pow(int n , int p)
	{
		int res = 1;
		for (int i =1; i<=p ; i++)
		{
			res =res + n;
		}
		return res;
	}
	
	public static String hex(int n)
	{
		String hex ="";
		while(n!=0) {
			int rem = n % 16;
			if(rem == 10) {
				hex = "a" + hex;
			}else if(rem == 11){
				hex = "b" + hex;
			}
			else if(rem == 12){
				hex = "c" + hex;
			}
			else if(rem == 13){
				hex = "d" + hex;
			}
			else if(rem == 14){
				hex = "e" + hex;
			}else if(rem == 15){
				hex = "f" + hex;
			}
			else {
				hex = rem  + hex;
			}
			n = n /16;
		}
		return hex;
		
	}
}
