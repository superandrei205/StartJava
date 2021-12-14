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

        int sumOdd = 0;
        int counter = 11;
        do {
            sumOdd += counter;
            counter += 2;
        } while (counter <= 17);
        System.out.println(sumOdd);
    }
}
