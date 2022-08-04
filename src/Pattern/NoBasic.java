package Pattern;

public class NoBasic {
    public static void main(String[] args) {
        int n=4;
        int m=5;

//        1

//          1
//          1 2
//          1 2 3

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

//        2 inverted pyramid no pattern
//           1 2 3 4
//           1 2 3
//           1 2
//           1

        for (int i = n; i>=1; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

//        3 flyod pattern

//        1
//        2 3
//        4 5 6
//        7 8 9 10

        int num=1;

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }



    }
}
