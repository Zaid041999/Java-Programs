package program.basic.loops.pattern.triangle.righttriangle1;

public class RightTrianglePattern5 {
    static char ch ='A';
    public static void main(String[] args) {
        int n=5;
        numberPattern(n);
        System.out.println();


    }
    public static void numberPattern(int n) {
        int k =1;
        for(int row=1;row<=n;row++){
            for(int col =row;col>=1;col--){
                System.out.print( col+" ");
            }
            System.out.println();
        }
    }

}
//1
//2 1
//3 2 1
//4 3 2 1
//5 4 3 2 1