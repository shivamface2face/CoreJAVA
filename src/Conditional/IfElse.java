package Conditional;
import java.util.*;
public class IfElse {
    public static void main(String[] args) {

        int a=18;

        if (a>=18){
            System.out.println("u can vote now");
        }else {
            System.out.println("u cant");
        }

        Scanner in=new Scanner(System.in);

        int n= in.nextInt();

        if(n%2==0){
            System.out.println("given no is even");
        }else {
            System.out.println("odd one");
        }

         int count=0;
        for (int i = 1; i <=10; i++) {
            if (n%2!=0){
                count=count+n;
            }else {
            }
        }
        System.out.println(count);

    }
}
