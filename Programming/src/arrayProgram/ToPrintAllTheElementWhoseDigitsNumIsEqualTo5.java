package arrayProgram;
//WAP to print all the element whose digits num is equal to 5
public class ToPrintAllTheElementWhoseDigitsNumIsEqualTo5 {

	public static void main(String[] args) {
		int[] a = { 19, 23, 41, 65, 18 };

		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			int n = a[i];
			while (n != 0) {
				int d = n % 10;
				sum = sum + d;
				n = n / 10;
			}
			if (sum == 5) {
				System.out.println(a[i]);
			}

		}
	}

}
