package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public int calculate(String mathExpression) {
        int result = 0;
        String[] mathExpressionInArr = mathExpression.split(" ");

        int a = Integer.parseInt(mathExpressionInArr[0]);
        char mathOperation = mathExpressionInArr[1].charAt(0);
        int b = Integer.parseInt(mathExpressionInArr[2]);

        switch (mathOperation) {
            case '+':
                return Math.addExact(a, b);
            case '-':
                return Math.subtractExact(a, b);
            case '*':
                return Math.multiplyExact(a, b);
            case '/':
                return a / b;
            case '^':
                return (int) Math.pow(a, b);
            case '%':
                return Math.floorMod(a ,b);
        }

        return result;
    }
}