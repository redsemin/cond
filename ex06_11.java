import java.util.Scanner;

public class ex06_11 {
    public static void main(String[] args) {
        Scanner hglee = new Scanner(System.in);

        int hap = 0;
        int num1, num2, num3;

        System.out.printf("시작값입력 :");
        num1 = hglee.nextInt();

        System.out.printf("끝값 입력 :");
        num2 = hglee.nextInt();

        System.out.printf("증가값입력 :");
        num3 = hglee.nextInt();

        for (int i = num1; i <= num2; i = i + num3) {
            hap += i;
        }
        System.out.println(num1 + "부터" + num2 + "까지" + num3 + "씩증가한 합은" + hap);
    }
}
