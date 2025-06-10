import java.util.*;
public class Functions2 {
    public static int calculateProduct(int a,int b){
       
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("product of two numbers:"+calculateProduct(a,b));
    }


}
