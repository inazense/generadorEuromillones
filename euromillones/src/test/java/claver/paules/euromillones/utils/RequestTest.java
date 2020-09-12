package claver.paules.euromillones.utils;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class RequestTest {

	@Test
	public void downloadCSVTest()
	{
		boolean isOk = true;
		Request request = new Request();
		try {
			request.downloadCSV();
		} catch (IOException e) {
			isOk = false;
			e.printStackTrace();
		}
		
		Assert.assertTrue(isOk);
	}
}
