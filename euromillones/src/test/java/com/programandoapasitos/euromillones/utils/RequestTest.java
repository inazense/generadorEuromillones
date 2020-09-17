package com.programandoapasitos.euromillones.utils;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class RequestTest {

    @Test
    public void downloadCSVTest()
    {
        Request request = new Request();
        boolean isOk = true;
        try {
            request.downloadCSV();
        } catch (IOException e) {
            isOk = false;
            e.printStackTrace();
        }

        Assert.assertTrue(isOk);
    }
}
