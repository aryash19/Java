import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr , int index1 ,int index3){
        int temp = arr[index1];
        arr[index1]= arr[index3];
        arr[index3]= temp;
    }
    static void reverse(int[] arr){
        int start = 0 ;
        int end = arr.length -1 ;
       while(start < end){
           swap(arr ,start , end) ;
           start ++ ;
           end--;
       }

    }
}
