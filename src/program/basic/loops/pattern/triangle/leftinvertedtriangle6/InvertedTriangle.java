package program.basic.loops.pattern.triangle.leftinvertedtriangle6;

public class InvertedTriangle {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){
            for(int col =1;col<=n;col++){
                if(col<row){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();
        int k=1;
        for(int row=1;row<=n;row++){
            for(int col =1;col<=n;col++){
//                if(row<=col){
//                    System.out.print(k++);
//                }else{
//                    System.out.print(" ");
//                }
                if(col<row){
                    System.out.print(" ");
                }else{
                    System.out.print(k++);
                }
            }
            k=1;
            System.out.println();
        }
    }
}
//*****
// ****
//  ***
//   **
//    *
//
//12345
// 1234
//  123
//   12
//    1
