//1  2  3  4
//5  6  7  8
//9  10 11 12
//13 14 15 16
package program.basic.loops.pattern.square1;

public class NumberPattern3 {
    public static void main(String[] args) {
        int num=5;
        int k=1;
        for(int row =1;row<num;row++){
            for(int col=1;col<num;col++){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
}
