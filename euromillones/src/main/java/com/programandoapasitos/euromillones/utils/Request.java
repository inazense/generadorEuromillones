package com.programandoapasitos.euromillones.utils;

import com.programandoapasitos.euromillones.config.Config;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Request {

    @SuppressWarnings("resource")
    public void downloadCSV() throws MalformedURLException, IOException
    {
        BufferedInputStream inputStream = new BufferedInputStream(new URL(Config.CSV_URL).openStream());
        FileOutputStream fileOS = new FileOutputStream(Config.CSV_NAME);
        byte data[] = new byte[1024];
        int byteContent;
        while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
            fileOS.write(data, 0, byteContent);
        }
    }
}
