package program.basic.loops.pattern.triangle.righttriangle1;

public class RightTrianglePattern3 {
    static char ch ='A';
    public static void main(String[] args) {
        int n=5;
        numberPattern(n);
        System.out.println();
        alphabetPattern(n);

    }
    public static void numberPattern(int n) {
        for(int row=1;row<=n;row++){
            for(int col =1;col<=row;col++){
                System.out.print(row +" ");
            }
            System.out.println();
        }
    }
    public static void alphabetPattern(int n) {
        for(int row=1;row<=n;row++){
            for(int col =1;col<=row;col++){
                System.out.print(ch+" ");

            }
            ch=(char)(ch+1);
            System.out.println();

        }
    }
}
//1
//2 2
//3 3 3
//4 4 4 4
//5 5 5 5 5
//
//A
//B B
//C C C
//D D D D
//E E E E E