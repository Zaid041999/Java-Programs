package program.basic.loops.pattern.triangle.righttriangle1;

public class RightTrianglePattern2 {
    static char ch ='A';
    static int k=1;
    public static void main(String[] args) {
        int n=5;

        numberPattern(n);
        System.out.println();
        alphabetPattern(n);

    }


    public static void numberPattern(int n) {
        for(int row=1;row<=n;row++){
            for(int col =1;col<=row;col++){
                System.out.print(k +" ");
                k++;
            }
            System.out.println();
        }
    }
    public static void alphabetPattern(int n) {
        for(int row=1;row<=n;row++){
            for(int col =1;col<=row;col++){
                System.out.print(ch+" ");
                ch=(char)(ch+1);
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
//
//A
//B C
//D E F
//G H I J
//K L M N O
