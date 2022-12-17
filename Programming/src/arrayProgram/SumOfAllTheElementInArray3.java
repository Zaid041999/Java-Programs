package arrayProgram;
//3//WAP to display sum of all the element of array
public class SumOfAllTheElementInArray3 {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 21, 3, 13 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);

	}

}
