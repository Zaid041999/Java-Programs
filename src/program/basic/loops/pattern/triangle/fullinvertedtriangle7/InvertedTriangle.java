package program.basic.loops.pattern.triangle.fullinvertedtriangle7;

public class InvertedTriangle {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){
            for(int col =1;col<=n;col++){
                if(col<row){
                    System.out.print(" ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
        int k=1;
        for(int row=1;row<=n;row++){
            for(int col =1;col<=n;col++){
                if(col<row){
                    System.out.print(" ");
                }else{
                    System.out.print(k++ +" ");
                }
            }
            k=1;
            System.out.println();
        }
        System.out.println();
       char ch='A';
        for(int row=1;row<=n;row++){
            for(int col =1;col<=n;col++){
                if(col<row){
                    System.out.print(" ");
                }else{
                    System.out.print(ch +" ");
                    ch=(char) (ch+1);
                }
            }
            ch='A';
            System.out.println();
        }
    }
}
//* * * * *
// * * * *
//  * * *
//   * *
//    *

//1 2 3 4 5
// 1 2 3 4
//  1 2 3
//   1 2
//    1
