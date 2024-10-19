package program.basic.loops.pattern.triangle.righttriangle1;

public class RightTrianglePattern4 {
    static char ch ='A';
    public static void main(String[] args) {
        int n=5;
        numberPattern(n);
        System.out.println();
        alphabetPattern(n);

    }
    public static void numberPattern(int n) {
        int k =1;
        for(int row=1;row<=n;row++){
            for(int col =1;col<=row;col++){
                System.out.print(k +" ");
            }
            System.out.println();
        }
    }
    public static void alphabetPattern(int n) {
        for(int row=1;row<=n;row++){
            for(int col =1;col<=row;col++){
                System.out.print(ch+" ");

            }
            ch ='A';
            System.out.println();

        }
    }
}
//1
//1 1
//1 1 1
//1 1 1 1
//1 1 1 1 1
//
//A
//A A
//A A A
//A A A A
//A A A A A