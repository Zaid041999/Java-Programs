package arrayProgram;
//WAP to find product of all the odd element in the array
public class ProductOfAllOddElementInArray4 {

	public static void main(String[] args) {
		int prod = 1;
		int[] a = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				prod = prod * a[i];
			}
		}
		System.out.println(prod);

	}

}
