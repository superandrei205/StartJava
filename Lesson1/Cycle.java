public class Cycle {
    public static void main(String[] args) {

        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        int i = 6;

        while (i >= -6) {
            System.out.println(i);
            i -= 2;
        }

        int sum = 0;
        int num = 11;

        do {
            sum += num;
            num += 2;
        } while (num <= 17);

        System.out.println(sum);
    }
}
