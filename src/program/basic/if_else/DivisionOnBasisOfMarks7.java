package program.basic.if_else;

import java.util.Scanner;

public class DivisionOnBasisOfMarks7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int percentage= sc.nextInt();
        if(percentage>=60 && percentage<=100){
            System.out.println("Division 1");
        } else if (percentage>=45 && percentage<=59) {
            System.out.println("Division 2");
        } else if (percentage>=30 && percentage<=44) {
            System.out.println("Division 3");
        }else if (percentage<30){
            System.out.println("Fail");
        }
    }
}
