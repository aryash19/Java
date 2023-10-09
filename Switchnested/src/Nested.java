import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empNo =in.nextInt();
        String department = in.next();

        switch (empNo) {
            case 1 -> System.out.println("Aryash");
            case 2 -> System.out.println("Parth yadav");
            case 3 -> {
                System.out.println("Emp no. 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department ");
                    case "HR" -> System.out.println("HR Department");
                    default -> System.out.println("enter department");
                }
            }
            default -> System.out.println("enter right Empno.");
        }

    }
}
