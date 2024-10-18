//* * * *
//*     *
//*     *
//* * * *
package program.basic.loops.pattern.square1;

import java.util.Arrays;

public class StarPattern2 {
    public static void main(String[] args) {
        int num =5;
        for(int row = 1; row < num; row++) {
            for (int col = 1; col < num; col++){
                if ((row == 1 || col == 1) || (row == num - 1 || col == num - 1)) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
