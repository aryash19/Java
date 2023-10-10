import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
      fun(2,3,8,9991,54);
    }

    static void mul(int a , int b , String ...v){

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }
}
