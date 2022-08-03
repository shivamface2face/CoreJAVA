package Pattern;

public class Basic {
    public static void main(String[] args) {
        int n=4;
        int m=5;

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



    }
}
