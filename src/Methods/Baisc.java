package Methods;

import java.util.Scanner;

public class Baisc {

     static void printMyName(String str){
         System.out.println(str);
         return;

    }

    public  static int printSum(int a,int b){
         return a+b;
    }

    public static void main(String[] args){

        Scanner in=new Scanner(System.in);
        String str= in.nextLine();
        int a= in.nextInt();
        int b= in.nextInt();

        int sum=printSum(a,b);
        System.out.println(sum);

        printMyName(str);


    }
}
