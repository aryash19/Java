import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
//        arr[0] = 5 ;
//        arr[1] = 3 ;
//        arr[2] = 7 ;
//        arr[3] = 8 ;
//        arr[4] = 6 ;

        for (int i = 0 ; i< arr.length ; i++){
            arr[i] = in.nextInt();
        }
        for (int j : arr) {
            System.out.println(j + "");
        }
        System.out.println(Arrays.toString(arr));
    }
}
