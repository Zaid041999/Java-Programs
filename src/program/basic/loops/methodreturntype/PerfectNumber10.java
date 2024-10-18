//A perfect number is a positive integer that is equal to the sum of its proper divisors, excluding
// the number itself.
//For instance, 6 has proper divisors 1, 2 and 3, and 1 + 2 + 3 = 6, so 6 is a perfect number.
package program.basic.loops.methodreturntype;
import java.util.Scanner;

public class PerfectNumber10 {
//    public static void main(String[] args) {
//        boolean  isPerfect =false;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Number :");
//        int num= sc.nextInt();
//        System.out.println("perfect Number is :"+isPerfect(num));
//        sc.close();
//    }
//    public static boolean isPerfect(int num){
//        int temp =num;
//        int sum =0;
//        for (int i=1 ;i<temp;i++){
//            if(temp%i==0){
//                sum =sum+i;
//            }
//        }
//        System.out.println("Sum of the number is :"+sum);
//        if(num==sum){
//            return true;
//        }else{
//            return false;
//        }
//
//    }
public static void main(String[] args) {
    boolean  isPerfect =false;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the starting number :");
    int startNum = sc.nextInt();
    System.out.println("Enter the last number :");
    int lastNum = sc.nextInt();

    System.out.println("Perfect Number from "+startNum+ " to " +lastNum);
    for (int i = startNum; i <=lastNum ; i++) {
        if (isPerfect(i)){
            System.out.println("perfect Number is :"+i);
        }

    }

    sc.close();
}
    public static boolean isPerfect(int num){
        int temp =num;
        int sum =0;
        for (int i=1 ;i<temp;i++){
            if(temp%i==0){
                sum =sum+i;
            }
        }
       // System.out.println("Sum of the number is :"+sum);
        if(num==sum){
            return true;
        }else{
            return false;
        }

    }
}
