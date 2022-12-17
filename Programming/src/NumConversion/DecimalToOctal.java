package NumConversion;

public class DecimalToOctal {
	public static void main(String[] args) {
		int n =15;
		String bin = "";
		while(n!=0) {
			int rem = n % 8;
			bin = rem + bin;
			n = n/8;
			
		}
		System.out.println(bin);

	}
}
