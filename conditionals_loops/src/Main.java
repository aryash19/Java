import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();

        if(salary>20000){
            salary = salary + 3000 ;

        } else if (salary>10000){
            salary = salary +2000;

        } else{
            salary += 1000;
        }
        System.out.println(salary);
    }
}
