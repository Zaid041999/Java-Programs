package program.basic.loops.pattern.triangle.rightandinverted3;

public class RightPlusRightInvertedPattern2 {
    public static void main(String[] args) {
        int n=5;
        int num=1;
        for(int row=1;row<=n;row++){
            for(int col =1;col<=row;col++){
                System.out.print(num++ +" ");

            }
            System.out.println();
        }
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <= n - row ; col++) {
                System.out.print(num++ +" ");
            }
            System.out.println();
        }
        //alternate
        for (int row =1;row<=2*n;row++){
            int cols = row < n ? row : 2 * n - row;
           for(int col=1;col<=cols;col++){
               System.out.print(num+" ");
               num++;
           }
            System.out.println();
        }
    }
}
//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15
//16 17 18 19
//20 21 22
//23 24
//25
//
//26
//27 28
//29 30 31
//32 33 34 35
//36 37 38 39 40
//41 42 43 44
//45 46 47
//48 49
//50

