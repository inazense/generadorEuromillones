package claver.paules.euromillones.dao;

import java.util.ArrayList;
import java.util.List;

public class Historic {

	// Properties
	private List<Ticket> historic;
	
	// Constructor
	public Historic()
	{
		this.historic = new ArrayList<Ticket>();
	}

	// Methods
	public List<Ticket> getHistoric() {
		return historic;
	}

	public void setHistoric(List<Ticket> historic) {
		this.historic = historic;
	}
	
	public void addTicketToHistoric(Ticket ticket)
	{
		this.historic.add(ticket);
	}
	
	public boolean isFilled()
	{
		int x = this.getHistoric().size();
		
		return x > 0;
	}
}
