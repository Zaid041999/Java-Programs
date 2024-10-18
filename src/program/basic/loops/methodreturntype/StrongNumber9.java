//Strong number means a positive integer whose sum of factorial of its digits equal to the number itself
//145= !1+!4+!5
//   = 1+24+120
//   = 145

package program.basic.loops.methodreturntype;

import java.util.Scanner;

public class StrongNumber9 {
//    public static void main(String[] args) {
//        boolean isStrong=false;
//        System.out.println("Enter the number:");
//        Scanner sc = new Scanner(System.in);
//        int num= sc.nextInt();
//        System.out.println("Strong Number: "+isStrong(num));
//        System.out.println("Number is : "+ num);
//        sc.close();
//    }
//    public static boolean isStrong(int num){
//        int temp=num;
//        int sum =0;
//        while(temp!=0){
//            int lastDigit= temp%10;
//            sum =sum+factorial(lastDigit);
//            temp=temp/10;
//        }
//        //temp=num;
//        if(num==sum){
//            return true;
//        }
//        return false;
//    }
//
//    private static int factorial(int lastDigit) {
//        int fact=1;
//        for (int i = 1; i <=lastDigit ; i++) {
//            fact*=i;
//        }
//        return fact;
//    }
    //Strong Number in range
    public static void main(String[] args) {
        boolean isStrong=false;
        System.out.println("Enter the starting number:");
        Scanner sc = new Scanner(System.in);
        int startNum= sc.nextInt();
        System.out.println("Enter the last number");
        int lastNum= sc.nextInt();
        System.out.println("Strong Number in the range from "+startNum+" to "+lastNum);
        for (int n = startNum; n <=lastNum; n++) {
            if(isStrong(n)){
                System.out.println(n);
            }
        }

        sc.close();
    }
    public static boolean isStrong(int num){
        int temp=num;
        int sum =0;
        while(temp!=0){
            int lastDigit= temp%10;
            sum =sum+factorial(lastDigit);
            temp=temp/10;
        }
        //temp=num;
        if(num==sum){
            return true;
        }
        return false;
    }

    private static int factorial(int lastDigit) {
        int fact=1;
        for (int i = 1; i <=lastDigit ; i++) {
            fact*=i;
        }
        return fact;
    }
}
