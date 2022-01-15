package src.com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public int calculate(String example) {
        int result = 0;
        String[] arr = example.split(" ");

        int a = Integer.parseInt(arr[0]);
        char mathOperation = arr[1].charAt(0);
        int b = Integer.parseInt(arr[2]);

        switch (mathOperation) {
            case '+':
                result = Math.addExact(a, b);
                break;
            case '-':
                result = Math.subtractExact(a, b);
                break;
            case '*':
                result = Math.multiplyExact(a, b);
                break;
            case '/':
                result = a / b;
                break;
            case '^':
                result = (int) Math.pow(a, b);
                break;
            case '%':
                result = Math.floorMod(a ,b);
                break;
        }

        return result;
    }
}