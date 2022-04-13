import java.util.Scanner;

public class EX06_10 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int hap=0;
        int i;
        int num;

        System.out.printf("값입력 :");
        num = s.nextInt();

        for (i =0; i <= num; i++){
            hap += i;

        }
        System.out.println("1부터"+num+"까지 합은"+hap);
    }
}
