package program.basic.loops;

import java.util.Scanner;

public class PrimeNumOrNot3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        isPrime(num);
        sc.close();
    }

    private static void isPrime(int num) {
        int temp =0;
        for(int i =2;i<=num-1;i++){
            if (num % i == 0) {
                temp=temp+1;
            }
        }
        if(temp==0){
            System.out.println("Prime num");
        }else{
            System.out.println("Not a prime");
        }
    }
}
