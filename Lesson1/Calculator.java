import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        startCalc();
    }

    public static void startCalc() {
        int result = 0;
        while(true) {
            System.out.println("Введите первое число");
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            System.out.println("Введите математическую операцию");
            char mathOperation = scan.next().charAt(0);
            System.out.println("Введите второе число");
            int b = scan.nextInt();

            if (mathOperation == '+') {
                result = summation(a, b);
            } else if (mathOperation == '-') {
                result = subtract(a, b);
            } else if (mathOperation == '*') {
                result = multiply(a, b);
            } else if (mathOperation == '/') {
                result = divide(a, b);
            } else if (mathOperation == '^') {
                result = pow(a, b);
            } else if (mathOperation == '%') {
                result = getRemaind(a, b);
            }

            System.out.println(a + " " + mathOperation + " " + b + " = " + result);
        }
    }

    public static int summation(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int divide(int x, int y) {
        return x / y;
    }

    public static int pow(int base, int powerRaised) {
        if (powerRaised != 0)
            return (base * pow(base, powerRaised - 1));
        else
            return 1;
    }

    public static int getRemaind(int x, int y) {
        return x % y;
    }
}

