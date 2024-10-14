package program.basic.loops;

import java.util.Scanner;

public class SumOfEvenNum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        even(n);
    }
    public static void even(int n){
        int i=1,sum=0;
        while(i<=n){
            if (i%2==0)
                sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}
