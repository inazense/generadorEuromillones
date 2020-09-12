package claver.paules.euromillones.utils;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import claver.paules.euromillones.statics.Path;

public class Request
{
	
	public void downloadCSV() throws MalformedURLException, IOException
	{
		// TODO: https://www.baeldung.com/java-download-file
		BufferedInputStream buffer = new BufferedInputStream(new URL(Path.CSV_URL).openStream());
		FileOutputStream output = new FileOutputStream(Path.CSV_NAME)
		{
			byte dataBuffer[] = new byte[1024];
			int bytesRead;
			while ((bytesRead = buffer.read(dataBuffer, 0, 1024)) != -1) {
				output.write(dataBuffer, 0, bytesRead);
		    }
		}
	}

}
