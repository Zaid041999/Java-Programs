package program.basic.if_else;

public class LeapYearOrNot8 {
    public static void main(String[] args) {
        int year=2029;
//        if(year%400==0||(year%4==0 && year%100!=0)){
//            System.out.println("Leap year");
//        }else {
//            System.out.println("not a leap year");
//        }
        if(year%4==0){
            if (year%100==0){
                if(year%400==0){
                    System.out.println("Leap year");
                }
                else {
                    System.out.println("Not a leap year");
                }
            }else {
                System.out.println("Leap year");
            }
        }else {
            System.out.println("Not a leap year");
        }
    }
}
