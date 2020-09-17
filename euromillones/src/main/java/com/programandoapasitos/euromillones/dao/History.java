package com.programandoapasitos.euromillones.dao;

import java.util.ArrayList;
import java.util.List;

public class History {

    private List<Ticket> ticketList;

    public History()
    {
        this.ticketList = new ArrayList<Ticket>();
    }

    public List<Ticket> getTicketList() {
        return ticketList;
    }

    public void setTicketList(List<Ticket> ticketList) {
        this.ticketList = ticketList;
    }

    public void addTicketToHistory(Ticket ticket)
    {
        this.ticketList.add(ticket);
    }

    public boolean isFilled()
    {
        return this.getTicketList().size() > 0;
    }
}
