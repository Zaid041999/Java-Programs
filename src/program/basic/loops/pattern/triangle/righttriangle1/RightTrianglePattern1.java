package program.basic.loops.pattern.triangle.righttriangle1;

public class RightTrianglePattern1 {
    static char ch ='A';
    public static void main(String[] args) {
        int n=5;
       //char ch ='A';
        starPattern(n);
        System.out.println();
        numberPattern(n);
        System.out.println();
        alphabetPattern(n);

    }

    public static void starPattern(int n) {
        for(int row=1;row<=n;row++){
            for(int col =1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void numberPattern(int n) {
        for(int row=1;row<=n;row++){
            for(int col =1;col<=row;col++){
                System.out.print(col+" ");
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
            ch='A';
            System.out.println();

        }
    }
}
//*
//* *
//* * *
//* * * *
//* * * * *
//
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
//
//A
//A B
//A B C
//A B C D
//A B C D E
