package com.programandoapasitos.euromillones.utils;

import com.programandoapasitos.euromillones.dao.History;
import com.programandoapasitos.euromillones.dao.Raffle;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;

public class EuromillonesHandlerTest {

    @Test
    public void generateRaffleTest()
    {
        boolean isOk = true;
        try
        {
            Raffle raffle = this.doTheThings();
        }
        catch (IOException e)
        {
            e.printStackTrace();
            isOk = false;
        }

        Assert.assertTrue(isOk);
    }

    private Raffle doTheThings() throws IOException {
        EuromillonHandler euro = new EuromillonHandler();
        Request request = new Request();
        request.downloadCSV();
        CSVHandler csvHandler = new CSVHandler();
        History history = csvHandler.generateEuromillonesHistory();
        Raffle raffle = euro.generateRaffle(history);
        raffle.generateRaffle();
        return raffle;
    }
}
