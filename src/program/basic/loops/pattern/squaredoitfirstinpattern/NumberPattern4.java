//1 2 3 4
//1     4
//1     4
//1 2 3 4
package program.basic.loops.pattern.squaredoitfirstinpattern;

public class NumberPattern4 {
    public static void main(String[] args) {
        int num =5;
        for(int row = 1; row < num; row++) {
            for (int col = 1; col < num; col++){
                if ((row == 1 || col == 1) || (row == num - 1 || col == num - 1)) {
                    System.out.print(col+" ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
