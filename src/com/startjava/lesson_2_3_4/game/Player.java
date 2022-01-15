package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    private int index = 0;
    private int[] answers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setAnswers(int number, int index) {
        this.answers[index] = number;
    }

    public int[] getAnswers() {
        return answers;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void resetAnswers() {
        setIndex(0);
        Arrays.fill(answers, 0, getIndex(), 0);
    }
}
