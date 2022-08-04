package Pattern;

public class Basic {
    public static void main(String[] args) {
        int n=4;
        int m=5;
        System.out.println();
        System.out.println();

//        1 solid triangle

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j<=m ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();

//   2 hollow rectangle

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=m ; j++) {

                if (i==1||j==1||j==m||i==n){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

        System.out.println();
        System.out.println();

// 3rd type *
//          * *
//          * * *

        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

//        4 th type reverse pyramid
//   * * *
//   * *
//   *

        for (int i = n; i>=1; i--) {
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

//   5 invert pyramid
//            *
//          * *
//        * * *

        for (int i = 1; i <=n; i++) {
//             1st inner loop for space
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
//            2nd inner loop for start as usual as ragular pyramid

            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }




    }
}
