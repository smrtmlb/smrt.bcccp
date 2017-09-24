package test.tickets.adhoc;

import java.util.ArrayList;
import java.util.List;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import bcccp.carpark.Carpark;
import bcccp.carpark.ICarpark;
import bcccp.carpark.ICarparkObserver;
import bcccp.tickets.adhoc.IAdhocTicket;
import bcccp.tickets.adhoc.IAdhocTicketDAO;
import bcccp.tickets.season.ISeasonTicket;
import bcccp.tickets.season.ISeasonTicketDAO;

public class TestAdhocTicket {
	
		private List<ICarparkObserver> observers;
	
	private int capacity;
	private int nParked;
	private IcarparkId carparkId;
	private iticketNo ticketNo;
	private Ibarcode barcode;
	private ISeasonTicketDAO seasonTicketDAO;
	private Istate state;
	
	private ICarparkObserver observer;
	private IAdhocTicket iAdhocTicket;
	private ISeasonTicket iSeasonTicket;
	
		@Before
	public void setUp() {
	
				
		carparkId = mock(Icarparid,class);
		ticketNo = mock(IticketNo, class);
		barcode = mock(Ibarcode, class);
		STATE.ISSUED = mock(Istate, class);
	}
	


}
