import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
       int ans = sum3(4,5);
        System.out.println(ans);
    }
    // pass the value of numbers when you are calling the method in main
    static int sum3(int a , int b){
        int sum = a+b;
        return sum ;
    }
    // return the value
     static int sum2(){
         Scanner in = new Scanner(System.in);
         int num1 = in.nextInt();
         int num2 = in.nextInt();

         int sum = num1 + num2 ;
         return sum;

     }
    static void sum(){
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int sum1 = num1 + num2 ;
        System.out.println("The Sum ="+ sum1);
    }
}

