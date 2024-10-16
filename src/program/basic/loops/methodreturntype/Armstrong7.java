package program.basic.loops.methodreturntype;

import java.util.Scanner;

public class Armstrong7 {
//    public static void main(String[] args) {
//        int n =153;
//        int temp =n ;
//        int rem;
//        int length =0;
//
//        //length of num in digit
//        while(temp!=0){
//            length++;
//            temp=temp/10;
//        }
//        System.out.println(length);
//
//        temp=n;
//        int sum=0;
//        while(temp!=0){
//            int prod=1;
//            rem=temp%10;
//            //length*digit
//            for (int i = 1; i <=length ; i++) {
//                prod=prod*rem;
//            }
//            //sum of digit after multiplication
//            sum=sum+prod;
//            temp=temp/10;
//        }
//        if (sum==n){
//            System.out.println("Armstrong Number");
//        }else {
//            System.out.println("Not an Armstrong Number");
//        }
//    }
        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter the number :");
            int number = sc.nextInt();
            System.out.println("Is An Armstrong Number : "+isArmstrong(number));
    }

    public static boolean isArmstrong(int num){
            int temp=num;
            int digit=0;
            while(temp!=0){
                temp=temp/10;
                digit++;
            }
        System.out.println("Number of digit is :"+digit);
            int sum =0;
            temp=num;
            while(temp!=0){
               int lastDigit=temp%10;
               sum=(int)(sum+Math.pow(lastDigit,digit));
               temp=temp/10;
            }
        System.out.println("Sum is :"+sum);
            if (sum==num){
                return true;
            }
            return false;
    }
}
