package program.basic.loops.pattern.triangle.fulltriangle5;

public class FullTrianglePattern1 {
    public static void main(String[] args) {
        int n =5;
        for (int row=1;row<=n;row++){
            //for space
            for (int col=1;col<=n-row;col++){
                System.out.print(" ");
            }
            //for star
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for (int row=1;row<=n;row++){
            //for space
            for (int col=1;col<=n-row;col++){
                System.out.print(" ");
            }
            //for star
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }
}
//    *
//   * *
//  * * *
// * * * *
//* * * * *
//
//    1
//   1 2
//  1 2 3
// 1 2 3 4
//1 2 3 4 5
