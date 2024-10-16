package program.basic.loops.methodreturntype;

import java.util.Scanner;

public class ArmstrongInRange8 {
    public static void main(String[] args) {
        System.out.println("Enter the starting number:");
        Scanner sc =new Scanner(System.in);
        int startingNumber = sc.nextInt();
        System.out.println("Enter the last number :");
        int lastNumber=sc.nextInt();
        System.out.println("Armstrong in the range from "+startingNumber+" to "+lastNumber);
        for (int n = startingNumber; n <=lastNumber; n++) {
            if(isArmstrong(n)){
                System.out.println(n);
            }
        }
    }
    public static boolean isArmstrong(int num){
        int temp=num;
        int digit=0;
        while(temp!=0){
            temp=temp/10;
            digit++;
        }
        //System.out.println("Number of digit is :"+digit);
        int sum =0;
        temp=num;
        while(temp!=0){
            int lastDigit=temp%10;
            sum=(int)(sum+Math.pow(lastDigit,digit));
            temp=temp/10;
        }
        //System.out.println("Sum is :"+sum);
        if (sum==num){
            return true;
        }
        return false;
    }
}
