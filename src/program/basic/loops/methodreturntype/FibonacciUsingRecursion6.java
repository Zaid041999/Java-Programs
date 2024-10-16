package program.basic.loops.methodreturntype;

import java.util.Scanner;

public class FibonacciUsingRecursion6 {
    static int a=0,b=1,c;
//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.print(a+" "+b);
//        fibonacciRecursion(num);
//
//    }
//
//    private static void fibonacciRecursion(int num) {
//        if(num>=1){
//            c=a+b;
//            System.out.print(" "+c);
//            a=b;
//            b=c;
//            fibonacciRecursion(--num);
//
//        }
//    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(a+" "+b);
        FibonacciUsingRecursion6 fib =new FibonacciUsingRecursion6();
        fib.fibonacciRecursion(num);

    }

    private  void fibonacciRecursion(int num) {
        if(num>=1){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            fibonacciRecursion(--num);

        }
    }

}
