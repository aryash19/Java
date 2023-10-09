import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();


        switch (fruit) {
            case "Mango" -> System.out.println("king");
            case "Apple" -> System.out.println("red");
            case "Orange" -> System.out.println("round");
            default -> System.out.println("not valid");
        }
    }
}
