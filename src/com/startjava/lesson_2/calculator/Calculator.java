package src.com.startjava.lesson_2.calculator;

public class Calculator {
    private int a;
    private char mathOperation;
    private int b;

    public static int calc(int a, char mathOperation, int b) {
        int result = 0;

        switch (mathOperation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '^':
                result = pow(a, b);
                break;
            case '%':
                result = a % b;
                break;
        }

        return result;
    }

    private static int pow(int base, int powerRaised) {
        if (powerRaised != 0)
            return (base * pow(base, powerRaised - 1));
        else
            return 1;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }

    public char getMathOperation() {
        return mathOperation;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }
}