package program.arrays;

public class RemoveDuplicateFromArray11 {
    public static void main(String[] args) {
        int []arr={1,1,2,2,2,3,3};
        int index =0;
        for (int i = 0; i < arr.length-1; i++) {
            //if arr.length-1 is not used then it will show the out of bound exception
            if(arr[i]!=arr[i+1]){
                arr[index]=arr[i];
                index++;
            }

        }
        arr[index]=arr[arr.length-1];
        for(int value:arr){
            System.out.print(value+"\t");
        }
    }
}
