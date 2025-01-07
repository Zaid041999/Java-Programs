package program.strings;

public class CountTheVowels5 {
    public static void main(String[] args) {
        String s ="Welcome";
        char []a=s.toCharArray();
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'
                    ||a[i]=='u'||a[i]=='A'||a[i]=='E'
                    ||a[i]=='I'||a[i]=='O'||a[i]=='U'){
                count++;
            }
        }
        //System.out.println(a);
        s=new String(a);
        System.out.println(count);

    }
}
