package com.programandoapasitos.euromillones.dao;

public class Raffle {

    private int bestNumbers[];
    private int bestStars[];
    private int worstNumbers[];
    private int worstStars[];

    public Raffle()
    {
        this.bestNumbers = new int[5];
        this.worstNumbers = new int[5];
        this.bestStars = new int[2];
        this.worstStars = new int[2];
    }

    public int[] getBestNumbers() {
        return bestNumbers;
    }

    public void setBestNumbers(int[] bestNumbers) {
        this.bestNumbers = bestNumbers;
    }
}
