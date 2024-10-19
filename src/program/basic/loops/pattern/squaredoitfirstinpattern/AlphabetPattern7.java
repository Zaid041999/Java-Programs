//A B C D
//A     D
//A     D
//A B C D
package program.basic.loops.pattern.squaredoitfirstinpattern;

public class AlphabetPattern7 {
    public static void main(String[] args) {
        int num =5;
        char ch='A';
        for(int row = 1; row < num; row++) {
            for (int col = 1; col < num; col++){
                if ((row == 1 || col == 1) || (row == num - 1 || col == num - 1)) {
                    System.out.print(ch+" ");
                }else {
                    System.out.print("  ");
                }
                ch=(char)(ch+1);
            }
            ch='A';
            System.out.println();
        }
    }
}
