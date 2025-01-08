package program.strings;

public class RemoveDuplicateCharFromString9 {

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
                if(count>=1) {
                    System.out.print(ch[i]);
                }

            }

        }
    }
}
