public class MyFirstGame {
    public static int randomNumber;
    private static int startRange = 1;
    private static int endRange = 10;

    public static void main(String[] args) {
        randomNumber = createRandomNumber();
        searchNumber();
    }

    private static int createRandomNumber() {
        long currentTime = System.currentTimeMillis();
        return (int) (startRange + currentTime % (endRange - startRange));
    }

    private static void searchNumber() {
        for (int i = 1; i <= endRange; i++) {
            checkNumber(i);
        }
    }

    private static void checkNumber(int num) {
        if (num > randomNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else if (num < randomNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else {
            System.out.println("Поздравляю, число угадано!");
            System.out.println(num);
        }
    }
}