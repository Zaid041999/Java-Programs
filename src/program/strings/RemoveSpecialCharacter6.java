package program.strings;

public class RemoveSpecialCharacter6 {
    public static void main(String[] args) {
        String s ="!Z#a&i*d)";
        String str = s.replaceAll("[^a-bA-Z0-9]","");
        System.out.println(str);

    }
}
