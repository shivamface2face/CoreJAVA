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




    }
}
