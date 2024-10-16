package program.basic.loops.methodreturntype;

import java.util.Scanner;

public class FactorialUsingRecursion4 {
    static int fact = 1;

    //    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num =sc.nextInt();
//        factRecursion(num);
//        System.out.println(fact);
//    }
//    public static void factRecursion(int num){
//
//       if(num>1){
//           fact*=num;
//           factRecursion(--num);
//       }
//
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        factRecursion(num);
//        System.out.println(fact);
//    }
//
//    public static int factRecursion(int num) {
//
//        if (num > 1) {
//            fact *= num;
//            factRecursion(--num);
//        }
//        return fact;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        FactorialUsingRecursion4 fr = new FactorialUsingRecursion4();
        fr.factRecursion(num);
        System.out.println(fact);
    }

    public int factRecursion(int num) {

        if (num > 1) {
            fact *= num;
            factRecursion(--num);
        }
        return fact;
    }
}
