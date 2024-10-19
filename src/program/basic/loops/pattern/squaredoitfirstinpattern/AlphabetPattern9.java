//A
//  B
//    C
//      D
//        E
package program.basic.loops.pattern.squaredoitfirstinpattern;

public class AlphabetPattern9 {
    public static void main(String[] args) {
        int n =5;
        char ch ='A';
        for(int row =1;row<=n;row++){
            for(int col =1;col<=n;col++){
                if(row==col){
                    System.out.print(ch+" ");
                }else{
                    System.out.print("  ");
                }
                ch=(char)(ch+1);
            }
            ch='A';
            System.out.println();
        }
    }
}
