package com.programandoapasitos.euromillones.dao;

public class Ticket {

    private int numbers[];
    private int stars[];

    public Ticket()
    {
        this.numbers = new int[5];
        this.stars = new int[2];
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int[] getStars() {
        return stars;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public void setStars(int[] stars) {
        this.stars = stars;
    }
}
