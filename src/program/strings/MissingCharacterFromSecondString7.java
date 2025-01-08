package program.strings;

public class MissingCharacterFromSecondString7 {

    public static char missingChar (String s1,String s2){
       char c='0' ;
        int i = 0;
        for (; i <s2.length() ; i++) {
            if(s1.charAt(i)!=s2.charAt(i)){
                c=s1.charAt(i);
                break;

            }

        }
        return c;
    }

    public static void main(String[] args) {
        String s = "racecar";
        String s2 = "racear";
        char c =missingChar(s,s2);
        System.out.println(c);
    }

}
