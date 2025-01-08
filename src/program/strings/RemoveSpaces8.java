package program.strings;

public class RemoveSpaces8 {


    public static void main(String[] args) {
        String s = "Twinkle Twinkle Little Star";
       // s = s.trim();
        String out = "";
        for (int i = 0; i <s.length() ; i++) {
           if(s.charAt(i)!=' '){
               out += s.charAt(i);
           }
        }
        System.out.println("Removed Spaces String is :"+out);
    }

}