public class Overloading {
    public static void main(String[] args) {
        fun(8);
        fun("aryash");
    } static void fun(int a){
        System.out.println(a);
    }
    static void fun(String aa){
        System.out.println(aa);
    }
}
