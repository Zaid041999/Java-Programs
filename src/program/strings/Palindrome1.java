package program.strings;

public class Palindrome1 {

    //using inbuilt methods
//    public static void main(String[] args) {
//        String s = "Noon";
//        s=s.trim();
//        String rev= "";
//        for (int i = s.length()-1; i >=0 ; i--) {
//            rev+=s.charAt(i);
//        }
//        if(s.equalsIgnoreCase(rev)){
//            System.out.println("Palindrome");
//        }else{
//            System.out.println("Not a palindrome");
//        }
//    }

    //without using inbuilt methods
    public static boolean isPalindrome(String s){
        int n = s.length();
        for (int i = 0; i <s.length()/2 ; i++) {
            if(s.charAt(i)!=s.charAt(n-1-i)){
                //Not palindrome
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(isPalindrome(s));
    }

}
