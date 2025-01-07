package program.strings;
//Reverse the String without changing the position
//Example : Welcome to mumbai
//output: emocleW ot iabmum
public class ReverseTheString3 {
    public static void main(String[] args) {
        String s ="Welcome to mumbai";
        String [] a =s.split(" ");
        for (int i = 0; i <a.length ; i++) {
            String rev="";
            for (int j = a[i].length()-1; j >=0 ; j--) {
                rev += a[i].charAt(j);
            }
            System.out.print(rev+ " ");

        }


    }
}
