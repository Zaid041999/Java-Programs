//1111
//2222
//3333
//4444
package program.basic.loops.pattern.square1;

public class NumberPattern2 {
    public static void main(String[] args) {
        int num=5;
        for(int row =1;row<num;row++){
            for(int col=1;col<num;col++){
                System.out.print(row);
            }
            System.out.println();
        }
    }
}
