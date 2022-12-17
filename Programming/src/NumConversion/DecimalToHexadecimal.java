package NumConversion;

public class DecimalToHexadecimal {
	public static void main(String[] args) {
		int  n= 10;
		String hex = "";
		while (n!=0) {
			int rem = n%16;
			if(rem == 10) {
				hex = "a" + hex;
				
			}else if (rem ==11) {
				hex = "b" + hex;
			}else if (rem ==12) {
				hex = "c" + hex;
			}else if (rem ==13) {
				hex = "d" + hex;
			}else if (rem ==14) {
				hex = "e" + hex;
			}else if (rem ==15) {
				hex = "f" + hex;
			}else {
				hex = rem + hex;
			}
			n = n/16;
		}
		System.out.println(hex);
	}
}
