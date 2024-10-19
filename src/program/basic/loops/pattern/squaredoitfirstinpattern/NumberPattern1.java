//1234
//1234
//1234
//1234
package program.basic.loops.pattern.squaredoitfirstinpattern;

public class NumberPattern1 {
    public static void main(String[] args) {
        int num=5;
        for(int row =1;row<num;row++){
            for(int col=1;col<num;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
