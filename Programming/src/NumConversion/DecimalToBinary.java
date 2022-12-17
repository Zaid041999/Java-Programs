package NumConversion;

public class DecimalToBinary {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  n= 8;
		String bin = "";
		while(n!=0)
		{
			int rem = n % 2;
			bin = rem + bin;
			n = n/2;
			
		}
		System.out.println(bin);
			
	}

}
