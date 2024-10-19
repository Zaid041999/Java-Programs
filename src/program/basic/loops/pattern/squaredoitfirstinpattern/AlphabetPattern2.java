//ABCD
//ABCD
//ABCD
//ABCD
package program.basic.loops.pattern.squaredoitfirstinpattern;

public class AlphabetPattern2 {
    public static void main(String[] args) {
        char ch ='A';
        int num=5;
        for (int row=1;row<num;row++){
            for(int col=1;col<num;col++){
                System.out.print(ch);
                ch=(char)(ch+1);

            }
            ch='A';
            System.out.println();
        }
    }
}
