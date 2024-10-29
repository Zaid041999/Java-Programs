package program.arrays;

public class RemoveDuplicateFromSortedArray13 {
    public static void main(String[] args) {
//        int []arr={1,1,2,2,2,3,3};
//        int index =0;
//        for (int i = 0; i < arr.length-1; i++) {
//            //if arr.length-1 is not used then it will show the out of bound exception
//             if(arr[i]!=arr[i+1]){
//                arr[index]=arr[i];
//                index++;
//            }
//
//        }
//        //if arr.length-1 is not used then it will show the out of bound exception
//        arr[index]=arr[arr.length-1];//last element of array
//
//
//        for(int value:arr){
//            System.out.print(value+"\t");
//        }
//        output:1	2	3	2	2	3	3
        int []a={1,1,2,2,2,3,3};
        int []temp=new int[a.length];
        int index=0;
        for (int i = 0; i <a.length-1 ; i++) {
            if(a[i]!=a[i+1]) {
                temp[index] = a[i];
                index++;
            }
        }
        temp[index]=a[a.length-1];
        for(int value:temp) {
            System.out.print(value + "\t");//1	2	3	0	0	0	0
        }

   }
}

