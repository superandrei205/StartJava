package src.com.startjava.lesson_2_3_4.calculator;
import java.util.Scanner;

public class CalculatorTest {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        createCalc();
        createQuestionToContinue();
    }

    private static void createCalc() {
        Calculator calculator = new Calculator();
        System.out.println("Введите математическое выражение: ");
        System.out.println(calculator.calculate(scan.nextLine()));
    }

    private static void createQuestionToContinue() {
        System.out.println("Хотите продолжить вычисления? [yes/no]:");
        String answer = scan.nextLine();
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
