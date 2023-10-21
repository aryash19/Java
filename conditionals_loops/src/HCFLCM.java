import java.util.Scanner;

public class HCFLCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b , Hcf , Lcm ;
        a = in.nextInt();
        b= in.nextInt();
        Hcf = a ;
        while(true){
         if((a%Hcf==0) && (b%Hcf==0)){
             break;
         }else {
             Hcf-- ;
         }
        }
        Lcm = (a*b)/Hcf;
        System.out.println("HCF IS:" + Hcf);
        System.out.println("LCM IS :" + Lcm);
    }

}
