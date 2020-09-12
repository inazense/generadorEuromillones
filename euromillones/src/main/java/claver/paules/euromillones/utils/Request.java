package claver.paules.euromillones.utils;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import claver.paules.euromillones.statics.Path;

public class Request
{
	
	/**
	 * Download CSV from HTTP URL
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	@SuppressWarnings("resource")
	public void downloadCSV() throws MalformedURLException, IOException
	{
		BufferedInputStream inputStream = new BufferedInputStream(new URL(Path.CSV_URL).openStream());
		FileOutputStream fileOS = new FileOutputStream(Path.CSV_NAME);
		byte data[] = new byte[1024];
	    int byteContent;
	    while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
	        fileOS.write(data, 0, byteContent);
	    }
	}
}
