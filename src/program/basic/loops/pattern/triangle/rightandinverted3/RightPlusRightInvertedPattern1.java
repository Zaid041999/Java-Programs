package program.basic.loops.pattern.triangle.rightandinverted3;

public class RightPlusRightInvertedPattern1 {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){
            for(int col =1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <= n - row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //alternate
        for (int row =1;row<=2*n;row++){
            int cols = row < n ? row : 2 * n - row;
           for(int col=1;col<=cols;col++){
               System.out.print("* ");
           }
            System.out.println();
        }
    }
}
//*
//* *
//* * *
//* * * *
//* * * * *
//* * * *
//* * *
//* *
//*
