package program.basic.loops;

public class ReverseStringIsPalindromeOrNot10 {
    public static void main(String[] args) {
        String name ="mom";
        boolean isPalindrome=false;
//        String temp = name;
//        String rev ="";
//        int len =temp.length();
//        for (int i =len-1;i>=0;i--){
//            rev =rev + temp.charAt(i);
//        }
//        if (rev.equals(temp)){
//            System.out.println("Palindrome");
//        }
//        else {
//            System.out.println("Not a Palindrome");
//        }
        int i=0;
        int j =name.length()-1;
        while(i<j){
            if(name.charAt(i)!=name.charAt(j)){
                isPalindrome =false;
            }
            isPalindrome=true;
            i++;
            j--;
        }
        System.out.println(isPalindrome);
    }
}
