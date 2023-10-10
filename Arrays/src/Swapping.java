import java.util.Arrays;

public class Swapping {
    public static void main(String[] args) {
        int[] arr = { 1,2,5,8,5};
        swap(arr, 1, 4);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr , int index1 ,int index3){
     int temp = arr[index1];
     arr[index1]= arr[index3];
     arr[index3]= temp;
    }
}
