public class MyFirstGame {
    public static int number;
    public static int rangeBegin = 1;
    public static int rangeEnd = 10;

    public static void main(String[] args) {
        number = createRandomNumber();
        searchNumber();
    }

    public static void searchNumber() {
        for (int i = 1; i <= rangeEnd; i++) {
            checkNumber(i);
        }
    }

//    public static int createRandomNumber() {
//        return (int) (  1 + Math.random()*100);
//    }

    public static int createRandomNumber() {
        long currentTime = System.currentTimeMillis();
        return (int) (rangeBegin + currentTime % (rangeEnd - rangeBegin));
    }

    public static void checkNumber(int num) {
        if (num > number) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else if (num < number) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else {
            System.out.println("Поздравляю, число угадано!");
            System.out.println(num);
        }
    }

}
