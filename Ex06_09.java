public class Ex06_09 {
    public static void main(String[] args) {

        int hap = 0;
        int i;

        for (i = 1; i < 11; i++) {
            hap +=i;
            System.out.println("hap 변수 값: "+hap);
            System.out.println("1변수 값: "+i);
            System.out.println("----------------");
        }
        System.out.println("1부터 10까지 합은" + hap);
    }
}
