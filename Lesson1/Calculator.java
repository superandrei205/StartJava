import java.util.Scanner;

public class Calculator {
    public static int result;

    public static void main(String[] args) {
        startCalc();
    }

    public static void startCalc() {
        while(true){
            System.out.println("Введите первый операнд");
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            System.out.println("Введите оператор");
            char mathOperation = scan.next().charAt(0);
            System.out.println("Введите второй операнд");
            int b = scan.nextInt();

            if (mathOperation == '+') {
                result = addition(a, b);
                System.out.println(a + " + " + b + " = " + result);
            } else if (mathOperation == '-') {
                result = subtraction(a, b);
                System.out.println(a + " - " + b + " = " + result);
            } else if (mathOperation == '*') {
                result = multiplication(a, b);
                System.out.println(a + " * " + b + " = " + result);
            } else if (mathOperation == '/') {
                result = division(a, b);
                System.out.println(a + " / " + b + " = " + result);
            } else if (mathOperation == '^') {
                result = pow(a, b);
                System.out.println(a + " ^ " + b + " = " + result);
            } else if (mathOperation == '%') {
                result = remaind(a, b);
                System.out.println(a + " % " + b + " = " + result);
            }
        }
    }

    public static int addition(int x, int y) {
        return x + y;
    }

    public static int subtraction(int x, int y) {
        return x - y;
    }

    public static int multiplication(int x, int y) {
        return x * y;
    }

    public static int division(int x, int y) {
        return x / y;
    }

    public static int pow(int base, int powerRaised) {
        if (powerRaised != 0)
            return (base * pow(base, powerRaised - 1));
        else
            return 1;
    }

    public static int remaind(int x, int y) {
        return x % y;
    }
}

