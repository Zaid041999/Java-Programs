package program.basic.loops.pattern.triangle.invertedrighttriangle2;

public class RightInvertedPattern1 {
    static char ch = 'A';

    public static void main(String[] args) {
        int n = 5;
        starPattern(n);
        System.out.println();
        numberPattern(n);
        System.out.println();
        numberPattern2(n);
        System.out.println();
        numberPattern3(n);
        System.out.println();
        alphabetPattern(n);
        System.out.println();
        alphabetPattern2(n);
        System.out.println();
        alphabetPattern3(n);
        System.out.println();
        alphabetPattern4(n);


    }

    public static void starPattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void numberPattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void numberPattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
    public static void numberPattern3(int n) {
        int k =1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }

    public static void alphabetPattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    public static void alphabetPattern2(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(ch + " ");
            }
            ch=(char)(ch+1);
            System.out.println();
        }

    }
    public static void alphabetPattern3(int n) {
        char ch ='A';
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print((char)ch );
                ch=(char)(ch+1);
            }

            System.out.println();
        }
    }
    public static void alphabetPattern4(int n) {
        char ch ='A';
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print((char)(ch));
                ch=(char)(ch+1);
            }
            ch='A';
            System.out.println();
        }
    }

}
//* * * * *
//* * * *
//* * *
//* *
//*
//
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1
//
//1 1 1 1 1
//2 2 2 2
//3 3 3
//4 4
//5
//
//1 2 3 4 5
//6 7 8 9
//10 11 12
//13 14
//15
//
//A A A A A
//A A A A
//A A A
//A A
//A
//
//A A A A A
//B B B B
//C C C
//D D
//E
//
//ABCDE
//FGHI
//JKL
//MN
//O
//
//ABCDE
//ABCD
//ABC
//AB
//A
