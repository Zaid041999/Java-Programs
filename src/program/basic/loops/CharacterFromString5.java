package program.basic.loops;

import java.util.Scanner;

public class CharacterFromString5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s =sc.next();
        for (char ch:s.toCharArray())
        {
            System.out.println(ch);
        }
    }
}
