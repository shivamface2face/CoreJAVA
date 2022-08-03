package Loops;

import java.util.Scanner;

public class Qes {
    public static void main(String[] args) {

//        1 print sum of n natural no

        int sum=0;

        for (int i = 1; i <=10; i++) {
            sum+=i;
        }
        System.out.println(sum);


//        2 table

        Scanner in=new Scanner(System.in);
        int n= in.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(n*i);
        }



    }
}
