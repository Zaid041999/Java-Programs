package program.strings;

public class RemoveSpecialCharacter6 {
    public static void main(String[] args) {
        String s ="!Z#ai&d)";
        String str = s.replaceAll("[^a-z A-Z 0-9]","");
        System.out.println(str);

    }
}
