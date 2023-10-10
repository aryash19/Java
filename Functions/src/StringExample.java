import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//      String message = greet();
//        System.out.println(message);
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String person=myGreat(name);
        System.out.println(person);
    }

     static String myGreat(String name) {
        String message = "hello " + name ;
        return message;
    }

    static String greet(){
     String greeting = "how are you";
        return greeting;
    }
}
