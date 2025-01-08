package program.strings;

public class SwapTwoStringWithoutUsingThirdVariable12 {


    public static void main(String[] args) {
        String a = "hello";
        String b = "world";

        a = a.concat(b);//a=a+b
        b =a.substring(0,a.length()-b.length());//b=a-b
        a=a.substring(b.length());//a=a-b
        System.out.println(a);
        System.out.println(b);


    }

}
