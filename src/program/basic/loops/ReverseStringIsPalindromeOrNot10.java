package program.basic.loops;

public class ReverseStringIsPalindromeOrNot10 {
    public static void main(String[] args) {
        String name ="mom";
        String temp = name;
        String rev ="";
        int len =temp.length();
        for (int i =len-1;i>=0;i--){
            rev =rev + temp.charAt(i);
        }
        if (rev.equals(temp)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}
