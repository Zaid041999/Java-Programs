//1  2  3  4
//5        6
//7        8
//9 10 11 12
package program.basic.loops.pattern.square1;

public class NumberPattern6 {
    public static void main(String[] args) {
        int num =5;
        int k=1;
        for(int row = 1; row < num; row++) {
            for (int col = 1; col < num; col++){
                if ((row == 1 || col == 1) || (row == num - 1 || col == num - 1)) {
                    System.out.print(k+++" ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
