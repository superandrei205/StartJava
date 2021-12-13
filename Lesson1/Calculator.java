import java.util.Scanner;
import java.util.Arrays;

public class Calculator {
    public static int result;

    public static void main(String[] args) {
        startCalc();
    }

    public static void startCalc() {

        System.out.println("Введите пример");
        Scanner scanCalc = new Scanner(System.in);
        String inputCalc = scanCalc.nextLine();
        String[] arrayInput = inputCalc.trim().split("");
        String[] removedNull = Arrays.stream(arrayInput)
                .filter(value ->
                        " ".equals(value) == false
                )
                .toArray(size -> new String[size]);

        if (removedNull[1].charAt(0) == '+') {
            result = addition(toInt(removedNull[0]), toInt(removedNull[2]));
            System.out.println(removedNull[0] + " + " + removedNull[2] + " = " + result);
            startCalc();
        } else if (removedNull[1].charAt(0) == '-') {
            result = subtraction(toInt(removedNull[0]), toInt(removedNull[2]));
            System.out.println(removedNull[0] + " - " + removedNull[2] + " = " + result);
            startCalc();
        } else if (removedNull[1].charAt(0) == '*') {
            result = multiplication(toInt(removedNull[0]), toInt(removedNull[2]));
            System.out.println(removedNull[0] + " * " + removedNull[2] + " = " + result);
            startCalc();
        } else if (removedNull[1].charAt(0) == '/') {
            result = division(toInt(removedNull[0]), toInt(removedNull[2]));
            System.out.println(removedNull[0] + " / " + removedNull[2] + " = " + result);
            startCalc();
        } else if (removedNull[1].charAt(0) == '^') {
            result = pow(toInt(removedNull[0]), toInt(removedNull[2]));
            System.out.println(removedNull[0] + " ^ " + removedNull[2] + " = " + result);
            startCalc();
        } else if (removedNull[1].charAt(0) == '%') {
            result = remaind(toInt(removedNull[0]), toInt(removedNull[2]));
            System.out.println(removedNull[0] + " % " + removedNull[2] + " = " + result);
            startCalc();
        }


    }


    public static int toInt(String str) {
        try {
            int i = Integer.parseInt(str.trim());
            return i;

        } catch (NumberFormatException e) {
            System.err.println("Неправильный формат строки!");
            return 0;
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

