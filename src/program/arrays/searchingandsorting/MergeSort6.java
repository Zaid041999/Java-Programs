package program.arrays.searchingandsorting;
//Time Complexity=>O(nlogn)
//Space => O(n)
public class MergeSort6 {

    public static void printArray(int []arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+"\t");
        }
    }

    private static void mergeSort(int[] arr, int si, int ei) {
        //Base Condition if all the element is separated and sorted
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2; //mid of arr
        mergeSort(arr,si,mid);//for left part of arr
        mergeSort(arr,mid+1,ei);

        merge(arr,si,mid,ei);
    }

    public static void merge(int []arr,int si,int mid, int ei){
        //left arr(0,2)=>3 ele  right arr(3,5)=>3  total=>6  (ei-si+1)=>(5-0+1)=>6
        int []temp= new int[ei-si+1];
        //iterators
        int i = si; //iterator index for left part of arr
        int j = mid+1; //iterator index for right part of arr
        int k = 0;//iterator index for temp arr

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        //for  leftover ele of 1st sorted part(left arr)
        while(i<=mid){
            temp[k++]=arr[i++];
        }

        //for leftover ele of 2nd sorted part(right arr)
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        //copy temp to original array
        for (k = 0,i=si; k < temp.length; k++,i++) {
            arr[i]=temp[k];
        }
    }

    public static void main(String[] args) {
        int []arr={6,3,9,5,2,8};
        mergeSort(arr,0,arr.length-1);
        printArray(arr);
    }


}
