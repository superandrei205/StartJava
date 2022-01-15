package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    static Scanner scan = new Scanner(System.in);
    private int randomNumber;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.randomNumber = 1 + (int) (Math.random() * 100);
    }

    public void play() {
        Player currentPlayer = player1;
        while (true) {
            if (player1.getIndex() >= 10 && player2.getIndex() >= 10) {
                showResults();
                break;
            } else {
                inputNumber(currentPlayer);
                if (compareNumbers(currentPlayer)) {
                    break;
                }
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            }
        }
    }

    private void inputNumber(Player player) {
        System.out.println(player.getName() + " Введите ответ");
        int number = scan.nextInt();
        player.setNumber(number);
        player.setAnswers(number, player.getIndex());
        player.setIndex(player.getIndex() + 1);
        if(player.getIndex() >= 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
    }

    private boolean compareNumbers(Player player) {
        if (player.getNumber() == randomNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + player.getNumber() + " с " + player.getIndex() + " попытки");
            showResults();
            return true;
        }
        if (player.getNumber() > randomNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else {
            System.out.println("Данное число меньше того, что загадал компьютер");
        }
        return false;
    }

    private void showResults () {
        int[] attemptsPlayer1 = Arrays.copyOf(player1.getAnswers(), player1.getIndex());
        System.out.println("Ответы " + player1.getName() + " : " + arrTostring(attemptsPlayer1));
        int[] attemptsPlayer2 = Arrays.copyOf(player2.getAnswers(), player2.getIndex());
        System.out.println("Ответы " + player2.getName() + " : " + arrTostring(attemptsPlayer2));
        player1.resetAnswers();
        player2.resetAnswers();
    }

    private String arrTostring(int[] arr) {
        String result = "";
        for (int item : arr)
        {
            result += item + " ";
        }
        return result;
    }
}