package src.com.startjava.lesson_2.calculator;
import java.util.Scanner;

public class CalculatorTest {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        createCalc();
        createQuestionToContinue();
    }

    private static void createCalc() {
        Calculator calculator = new Calculator();
        System.out.println("Введите первое число");
        calculator.setA(scan.nextInt());
        System.out.println("Введите математическую операцию");
        calculator.setMathOperation(scan.next().charAt(0));
        System.out.println("Введите второе число");
        calculator.setB(scan.nextInt());
        int result = calculator.calc(calculator.getA(), calculator.getMathOperation(), calculator.getB());
        System.out.println(calculator.getA() + " " + calculator.getMathOperation() + " " + calculator.getB() + " = " + result);
    }

    private static void createQuestionToContinue() {
        System.out.println("Хотите продолжить вычисления? [yes/no]:");
        String answer = scan.next();
        if (answer.equals("yes")) {
            createCalc();
            createQuestionToContinue();
        } else if (answer.equals("no")) {
            return;
        } else {
            createQuestionToContinue();
        }
    }
}
