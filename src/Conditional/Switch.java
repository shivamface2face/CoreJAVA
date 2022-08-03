package Conditional;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int button= in.nextInt();



        switch (button){
            case 1:
                System.out.println("print 1");
            break;
            case 2:
                System.out.println("print 2");
                break;
            default:
                System.out.println("print none");

        }
    }
}
