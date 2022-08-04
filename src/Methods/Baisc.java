package Methods;

import java.util.Scanner;

public class Baisc {

     static void printMyName(String str){
         System.out.println(str);
         return;

    }

    public static void main(String[] args){

        Scanner in=new Scanner(System.in);
        String str= in.nextLine();
        printMyName(str);


    }
}
