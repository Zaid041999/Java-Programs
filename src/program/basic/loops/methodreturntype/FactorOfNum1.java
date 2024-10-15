package program.basic.loops.methodreturntype;

import java.util.Scanner;

public class FactorOfNum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        factor(num);
    }
    public static void factor(int num){
        for(int i= 1;i<=num; i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
}
