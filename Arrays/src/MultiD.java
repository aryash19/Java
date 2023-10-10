import java.util.Arrays;
import java.util.Scanner;

public class MultiD {
    public static void main(String[] args) {
//       int[][] arr = new int[3][];
//       int [][] arr4={{5,8,8},{8,9,8}};\
        Scanner  in = new Scanner(System.in);

        int [][] arr = new int[3][3];

        for(int i = 0; i< arr.length; i++){
            for (int j = 0 ; j < arr[i].length; j++){
                arr[i][j]= in.nextInt();
            }


        }
        for(int i = 0; i< arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        for (int[] ints : arr) {
            for (int j = 0; j < ints.length; j++) {
                System.out.println(ints[j] + "");
            }
            System.out.println();
        }
    }
}
