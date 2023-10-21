import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        int Year = in.nextInt();
        if((Year%400 == 0) || ((Year%100 !=0)  && (Year%4==0))){
            System.out.println("Leap Year" + Year);
        }else{
            System.out.println("Not a leap year");
        }
    }
}
