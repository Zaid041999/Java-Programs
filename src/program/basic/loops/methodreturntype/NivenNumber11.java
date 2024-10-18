//A Niven number, also known as a Harshad number, is an integer that is divisible by the sum of its digits
//e.g. 12 sum of digits is 3 (1+2) and 12 is divisible by 3 -> 12 is a niven number
package program.basic.loops.methodreturntype;

import java.util.Scanner;

public class NivenNumber11 {
//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        int num = sc.nextInt();
//        boolean isNiven=false;
//        System.out.println("Niven number is :"+isNiven(num));
//    }
//
//    private static boolean isNiven(int num) {
//       int temp=num;
//        int sum =0;
//
//        while (temp!=0){
//            int lastDigit =temp%10;
//            sum=sum+lastDigit;
//            temp=temp/10;
//
//        }
//        if (num%sum==0){
//            return true;
//        }else {
//            return false;
//        }
//    }
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int startnum = sc.nextInt();
    int lastnum = sc.nextInt();
    boolean isNiven=false;
    //System.out.println("Niven number is :"+isNiven(num));
    for (int i = startnum; i <=lastnum ; i++) {
        if (isNiven(i)) {
            System.out.println("Niven Number: "+i);
        }
    }
}

    private static boolean isNiven(int num) {
        int temp=num;
        int sum =0;

        while (temp!=0){
            int lastDigit =temp%10;
            sum=sum+lastDigit;
            temp=temp/10;

        }
        if (num%sum==0){
            return true;
        }else {
            return false;
        }
    }
}
