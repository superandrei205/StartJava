package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int index;
    private int[] answers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCurrentAnswer() {
        return this.answers[index - 1];
    }

    public void setAnswer(int number, int index) {
        this.answers[index] = number;
    }

    public int[] getAnswers() {
        return Arrays.copyOf(answers, index);
    }

    public void setIndex() {
        index++;
    }

    public int getIndex() {
        return index;
    }

    public void resetAnswers() {
        index = 0;
        Arrays.fill(answers, 0, index, 0);
    }
}
