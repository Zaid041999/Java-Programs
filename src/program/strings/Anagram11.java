package program.strings;

public class Anagram11 {

    public static void sort (char []c ){
        for (int round = 0; round <c.length-1 ; round++) {
            int swap =0;
            for (int j =0; j <c.length-round-1 ; j++) {
                if(c[j]>c[j+1]){
                    char temp = c[j];
                    c[j]=c[j+1];
                    c[j+1]=temp;
                    swap=1;
                }
            }
        }
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        char []c1=s1.toCharArray();
        char []c2=s2.toCharArray();
        boolean isAnagram=true;
        if(s1.length()!=s2.length()){
            isAnagram=false;
        }else {
            sort(c1);
            sort(c2);
            for (int i = 0; i <c2.length ; i++) {
                if(c1[i]!=c2[i]){
                    isAnagram=false;
                }
            }
        }
        if(isAnagram){
            System.out.println("Both are Anagram");
        }else{
            System.out.println("Both are not Anagram");
        }

    }

}
