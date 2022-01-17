package com.startjava.lesson_2_3_4.game;

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
        System.out.println("У каждого игрока по 10 попыток");
    }

    public void play() {
        Player currentPlayer = player1;
        while (player2.getIndex() < 10) {
            inputNumber(currentPlayer);
            if (compareNumbers(currentPlayer)) {
                System.out.println("Игрок " + currentPlayer.getName() + " угадал число "
                        + currentPlayer.getCurrentAnswer() + " с " + currentPlayer.getIndex() + " попытки");
                break;
            }
            if (currentPlayer.getIndex() >= 10) {
                System.out.println("У " + currentPlayer.getName() + " закончились попытки");
            }
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
        showResults(player1);
        showResults(player2);
        player1.resetAnswers();
        player2.resetAnswers();
    }

    private void inputNumber(Player player) {
        System.out.println(player.getName() + " Введите ответ");
        int number = scan.nextInt();
        player.setAnswer(number);
        player.incIndex();
    }

    private boolean compareNumbers(Player player) {
        if (player.getCurrentAnswer() == randomNumber) {
            return true;
        }
        if (player.getCurrentAnswer() > randomNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else {
            System.out.println("Данное число меньше того, что загадал компьютер");
        }
        return false;
    }

    private void showResults(Player player) {
        int[] attemptsPlayer = player.getAnswers();
        System.out.print("Ответы " + player.getName() + " : ");
        for (int answer : attemptsPlayer)
            System.out.print(answer + " ");
        System.out.println();
    }
}