package claver.paules.euromillones.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import claver.paules.euromillones.dao.Historic;
import claver.paules.euromillones.dao.Ticket;
import claver.paules.euromillones.statics.Path;

public class CSVHandler 
{
	public Historic generateEuromillonesHistory() throws IOException
	{
		Historic h = new Historic();
		BufferedReader reader = new BufferedReader(new FileReader(Path.CSV_NAME));
		String line = reader.readLine();
		line = reader.readLine(); // Second line is the first important one
		while (line != null)
		{
			String[] fields = line.split(Path.SPLITTER);
			Ticket ticket = this.createTicketFromLine(fields);
			h.addTicketToHistoric(ticket);
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
