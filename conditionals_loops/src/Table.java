import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int Number = in.nextInt() ;
        int Tab;
        for (int i=1; i<= 10 ; i++){
            Tab = Number * i ;
            System.out.println(Tab);


        }
    }
}
