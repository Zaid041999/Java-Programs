package program.strings;

public class OccurrenceOfTheLetterInString10 {

    public static void main(String[] args) {
        String s = "Apple";
        char [] ch =s.toCharArray();
        boolean[] b = new boolean[ch.length];
        for (int i = 0; i < b.length; i++) {
            if(b[i]==false) {
                int count =1;
                for (int j = i+1; j < b.length; j++) {
                    if(ch[i]==ch[j]) {
                        count++;
                        b[j]=true;
                    }
                }
                    System.out.print(ch[i]+""+count+" ");
            }
        }
    }
}
