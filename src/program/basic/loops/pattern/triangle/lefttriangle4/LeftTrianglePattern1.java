package program.basic.loops.pattern.triangle.lefttriangle4;

public class LeftTrianglePattern1 {
    public static void main(String[] args) {
        int n =5;
        for (int row=1;row<=n;row++){
            //for space
            for (int col=1;col<=n-row;col++){
                System.out.print(" ");
            }
            //for star
            for(int col=1;col<=row;col++){
                System.out.print("*");
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
                System.out.print(col);
            }
            System.out.println();
        }

    }
}
//    *
//   **
//  ***
// ****
//*****


//    1
//   12
//  123
// 1234
//12345