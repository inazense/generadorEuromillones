package com.programandoapasitos.euromillones.dao;

import com.programandoapasitos.euromillones.config.Config;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

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

    public int[] getBestStars() {
        return bestStars;
    }

    public void setBestStars(int[] bestStars) {
        this.bestStars = bestStars;
    }

    public int[] getWorstNumbers() {
        return worstNumbers;
    }

    public void setWorstNumbers(int[] worstNumbers) {
        this.worstNumbers = worstNumbers;
    }

    public int[] getWorstStars() {
        return worstStars;
    }

    public void setWorstStars(int[] worstStars) {
        this.worstStars = worstStars;
    }

    public void generateRaffle() throws IOException
    {
        BufferedWriter writer = new BufferedWriter(new FileWriter(Config.RAFFLE_WINNER));
        writer.write("Mejor apuesta:\n");
        writer.write(Arrays.toString(this.bestNumbers) + "\n");
        writer.write(Arrays.toString(this.bestStars) + "\n");
        writer.write("Peor apuesta:");
        writer.write(Arrays.toString(this.worstNumbers) + "\n");
        writer.write(Arrays.toString(this.worstStars) + "\n");

        writer.close();
    }
}
