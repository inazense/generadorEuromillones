package com.programandoapasitos.euromillones.utils;

import com.programandoapasitos.euromillones.config.Config;
import com.programandoapasitos.euromillones.dao.History;
import com.programandoapasitos.euromillones.dao.Ticket;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVHandler {

    public History generateEuromillonesHistory() throws IOException
    {
        History h = new History();
        BufferedReader reader = new BufferedReader(new FileReader(Config.CSV_NAME));
        String line = reader.readLine();
        line = reader.readLine(); // Second line is the first important one
        while (line != null)
        {
            String[] fields = line.split(Config.SPLITTER);
            Ticket ticket = this.createTicketFromLine(fields);
            h.addTicketToHistory(ticket);
            line = reader.readLine();
        }

        if (reader != null)
        {
            reader.close();
        }

        return h;
    }

    private Ticket createTicketFromLine(String[] fields)
    {
        Ticket ticket = new Ticket();

        int[] numbers = new int[5];
        int[] stars = new int[2];

        numbers[0] = Integer.parseInt(fields[1]);
        numbers[1] = Integer.parseInt(fields[2]);
        numbers[2] = Integer.parseInt(fields[3]);
        numbers[3] = Integer.parseInt(fields[4]);
        numbers[4] = Integer.parseInt(fields[5]);

        stars[0] = Integer.parseInt(fields[7]);
        stars[1] = Integer.parseInt(fields[8]);

        ticket.setNumbers(numbers);
        ticket.setStars(stars);

        return ticket;
    }
}
