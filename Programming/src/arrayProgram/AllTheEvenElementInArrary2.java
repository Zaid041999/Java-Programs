package arrayProgram;

public class AllTheEvenElementInArrary2 {

	public static void main(String[] args) {
		int [] a= {21,22,13,3,10};
		for(int i = 0;i<a.length;i++)
		{
			if(a[i]%2 ==0) //even element
			{	
			System.out.println(a[i]);
			}
		}

	}

}
