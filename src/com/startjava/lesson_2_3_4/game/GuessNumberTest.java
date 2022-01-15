package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Player player1 = createPlayer(1);
        Player player2 = createPlayer(2);
        System.out.println("У каждого игрока по 10 попыток");
        do {
            GuessNumber game = new GuessNumber(player1, player2);
            game.play();
        } while (isNext());
    }

    private static Player createPlayer(int count) {
        System.out.println("Введите имя " + count + " игрока");
        return new Player(scan.nextLine());
    }

    private static boolean isNext() {
        String answer = "";
        while (!"yes".equals(answer)) {
            System.out.println("Хотите продолжить игру? [yes/no]:");
            answer = scan.next();
            if ("no".equals(answer)) {
                return false;
            }
        }
        return true;
    }
}