package program.basic.loops;

public class PalindromeOrNot8 {
    public static void main(String[] args) {
        int n=121;
        int temp=n;
        int rev=0;
        while(temp!=0){
            int rem = temp%10;
            rev = rev*10+rem;
            temp=temp/10;
        }
        if(n==rev){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a palindrome");
        }

    }
}
