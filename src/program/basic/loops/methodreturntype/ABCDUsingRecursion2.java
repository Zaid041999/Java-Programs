package program.basic.loops.methodreturntype;

public class ABCDUsingRecursion2 {
    public static void main(String[] args) {
        printChar('A');
    }
    public static void printChar(char ch){
        if(ch>'D'){
            return;
        }
        System.out.print(ch);
        printChar((char)(ch+1));
    }
}
