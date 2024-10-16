package program.basic.loops.methodreturntype;

import java.util.Scanner;

public class Factorial3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        int fact =1;
        for (int i = 1; i <=num ; i++) {
            fact*=i;
        }
        System.out.println("Factorial of num "+num+" is "+fact);
    }
}
