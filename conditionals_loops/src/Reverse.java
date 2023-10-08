import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Number = in.nextInt();
        int reverse = 0;

        while(Number>0){
            int temp = Number %10;
             reverse = (reverse*10) + temp ;
             Number = Number/10;
        }
        System.out.println(reverse);
    }
}
