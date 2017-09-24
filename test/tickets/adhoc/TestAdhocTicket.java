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
	private ientryDateTime entryDateTime;
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
	
	@After
	public void tearDown() throws Exception {
		carparkId = null;
		ticketNo = null;
		barcode = null;
	}
	
	@Test
	public String testgetBarcode() {
		
		assertTrue(ibarcode instanceof ibarcode);
		assertEquals(ibarcode.getName(), barcode);
	}
	
	@Test
	public String testgetCarparkId() {
		assertTrue(iCarpark instanceof ICarpark);
		assertEquals(iCarpark.getName(), carparkId);
	
	}
	
	@Test
	public Int testgetTicketNo() {
		assertTrue(igetTicketNo instanceof igetTicketNo);
		assertEquals(igetTicketNo.getName(), getTicketNo);
	
	}
	
	@Before
	public void setUpenter() {
		entryDateTime = mock(ientryDateTime,class);
		STATE.CURRENT = mock(istate_, class);
		
	}
	
	@Test
	public Int testgetEntryDateTime() {
		assertTrue(ientryDateTime instanceof ientryDateTime);
		assertEquals(ientryDateTime.getName(), entryDateTime);
	
	}
	
	@Test
	public Int testgetEntryDateTime() {
		assertTrue(ientryDateTime instanceof ientryDateTime);
		assertEquals(ientryDateTime.getName(), entryDateTime);
	
	}

	
	
	@before
	public void setpay() {
		
		paidDateTime = mock(ipaidDateTime,class);
		STATE.PAID = mock(iPAID, class);
		
	}
	
	@Test
	public Int testgetPaidDateTime() {
		assertTrue(igetPaidDateTime instanceof igetPaidDateTime);
		assertEquals(igetPaidDateTime.getName(), getPaidDateTime);
	
	}
	
	@Test
	public Int testgetCharge() {
		assertTrue(igetCharge instanceof igetCharge);
		assertEquals(igetCharge.getName(), getCharge);
	
	}
	
	@Test
	public Int testisCurrent() {
		assertTrue(igetCharge instanceof igetCharge);
		assertEquals(igetCharge.getName(), getCharge);
	
	}


	@Test
	public long testgetExitDateTime() {
		assertTrue(iexitDateTime instanceof iexitDateTime);
		assertEquals(iexitDateTime.getName(), exitDateTime);
	
	}
	
	

	


}
