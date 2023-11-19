public class Main {

    public static void main(String[] args) {
//        System.out.println("hello");

        int sum=0;
        for (int i = 1; i <11 ; i++) {
            if (i%2!=0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
