package program.basic.loops;

public class ReverseNumIsEvenOrOdd7 {
    public static void main(String[] args) {
        int n =123456;
        int rev=0;
        while(n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if(rev%2==0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}
