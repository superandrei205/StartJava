import java.util.Scanner;

public class Calculator {
    public static int result;

    public static void main(String[] args) {
        startCalc();
    }

    public static void startCalc() {
        System.out.println("Введите первый операнд");
        Scanner scanFirstOperator = new Scanner(System.in);
        String firstOperator = scanFirstOperator.nextLine();
        System.out.println("Введите оператор");
        Scanner scanOperand = new Scanner(System.in);
        String operand = scanOperand.nextLine();
        System.out.println("Введите второй операнд");
        Scanner scanSecondOperand = new Scanner(System.in);
        String secondOperand = scanSecondOperand.nextLine();

        if (operand.charAt(0) == '+') {
            result = addition(toInt(firstOperator), toInt(secondOperand));
            System.out.println(firstOperator + " + " + secondOperand + " = " + result);
            startCalc();
        } else if (operand.charAt(0) == '-') {
            result = subtraction(toInt(firstOperator), toInt(secondOperand));
            System.out.println(firstOperator + " - " + secondOperand + " = " + result);
            startCalc();
        } else if (operand.charAt(0) == '*') {
            result = multiplication(toInt(firstOperator), toInt(secondOperand));
            System.out.println(firstOperator + " * " + secondOperand + " = " + result);
            startCalc();
        } else if (operand.charAt(0) == '/') {
            result = division(toInt(firstOperator), toInt(secondOperand));
            System.out.println(firstOperator + " / " + secondOperand + " = " + result);
            startCalc();
        } else if (operand.charAt(0) == '^') {
            result = pow(toInt(firstOperator), toInt(secondOperand));
            System.out.println(firstOperator + " ^ " + secondOperand + " = " + result);
            startCalc();
        } else if (operand.charAt(0) == '%') {
            result = remaind(toInt(firstOperator), toInt(secondOperand));
            System.out.println(firstOperator + " % " + secondOperand + " = " + result);
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

