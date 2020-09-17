package com.programandoapasitos.euromillones.utils;

import com.programandoapasitos.euromillones.dao.History;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class CSVHandlerTest {

    @Test
    public void generateEuromillonesHistoryTest()
    {
        boolean isOk = true;
        CSVHandler csvHandler = new CSVHandler();
        History h = new History();

        try
        {
            h = csvHandler.generateEuromillonesHistory();
        }
        catch (IOException e)
        {
            isOk = false;
        }

        Assert.assertTrue(isOk && h.isFilled());
    }
}
