package program.basic.loops.methodreturntype;

public class Armstrong7 {
    public static void main(String[] args) {
        int n =153;
        int temp =n ;
        int rem;
        int length =0;

        //length of num in digit
        while(temp!=0){
            length++;
            temp=temp/10;
        }
        System.out.println(length);

        temp=n;
        int sum=0;
        while(temp!=0){
            int prod=1;
            rem=temp%10;
            //length*digit
            for (int i = 1; i <=length ; i++) {
                prod=prod*rem;
            }
            //sum of digit after multiplication
            sum=sum+prod;
            temp=temp/10;
        }
        if (sum==n){
            System.out.println("Armstrong Number");
        }else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
