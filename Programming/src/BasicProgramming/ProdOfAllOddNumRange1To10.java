package BasicProgramming;
//6
public class ProdOfAllOddNumRange1To10 {

	public static void main(String[] args) {
		int prod =1;
		for (int i =1; i<=10 ; i++)
		{
			if(i%2==1) {
				prod=prod*i;
			}
		}
		System.out.println(prod);

	}

}
