package program.basic.loops;

import java.util.Scanner;


public class PrimeNumInRange4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        isPrime(num);
        sc.close();
    }
    public static void isPrime(int num){
        int temp=0;
        for(int i =1;i<=num;i++){
            for (int j=2;j<=i-1;j++){
                if (i%j==0){
                    temp = temp +1;
                }
            }
            if(temp==0){
                System.out.println(i);
            }else {
                temp=0;
            }
        }
    }
}
