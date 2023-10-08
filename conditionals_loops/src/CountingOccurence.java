import java.util.Scanner;

public class CountingOccurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int value = in.nextInt();

        int count = 0;

        int  rem ;

        while(n>0){
            rem= n %10 ;
            if(rem==value){
                count++;
            }
            n = n/10 ;

        }
        System.out.println(count);

    }
}
