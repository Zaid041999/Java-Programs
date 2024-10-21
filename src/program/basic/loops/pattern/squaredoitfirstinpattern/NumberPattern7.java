//1
//  2
//    3
//      4
//        5
package program.basic.loops.pattern.squaredoitfirstinpattern;

public class NumberPattern7 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == col || (row + col == n + 1)) {
                    System.out.print(col + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

//       5
//      4
//    3
//  2
//1
        //public static void main(String[] args) {
        //int n =5;
//            for(int row =1;row<=n;row++){
//                for(int col =1;col<=n;col++){
//                    if(row + col ==n+1){
//                        System.out.print(col+" ");
//                    }else{
//                        System.out.print("  ");
//                    }
//                }
//                System.out.println();
//            }
//        }
    }
}
