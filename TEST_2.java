public class TEST_2 {
    public static void main(String[] args) {


        int f = 1;


        for (int i = 5; i > 0; i--) {
            f *= i;
            System.out.println("중간 계산 값 :" + f);
        }
        System.out.println("5!값은" + f);
    }
}
