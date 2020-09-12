package claver.paules.euromillones.utils;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import claver.paules.euromillones.dao.Historic;

public class CSVHandlerTest {

	@Test
	public void generateEuromillonesHistoryTest()
	{
		boolean isOk = true;
		CSVHandler csvHandler = new CSVHandler();
		Historic h = new Historic();
		
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
