package test.carpark;

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

public class TestCarpark {
	ICarpark iCarpark;
	private List<ICarparkObserver> observers;
	private String carparkId;
	private int capacity;
	private int nParked;
	private IAdhocTicketDAO adhocTicketDAO;
	private ISeasonTicketDAO seasonTicketDAO;
	
	private ICarparkObserver observer;
	private IAdhocTicket iAdhocTicket;
	private ISeasonTicket iSeasonTicket;
	
	@Before
	public void setUp() {
		iCarpark = mock(ICarpark.class);
		adhocTicketDAO = mock(IAdhocTicketDAO.class);
		seasonTicketDAO = mock(ISeasonTicketDAO.class);	
		observer = mock(ICarparkObserver.class);
		iSeasonTicket = mock(ISeasonTicket.class);
		
		observers = new ArrayList<ICarparkObserver>();
		
		//iCarpark = new Carpark(carparkId, capacity, adhocTicketDAO, seasonTicketDAO);		
	}
	
	@After
	public void tearDown() throws Exception {
		iCarpark = null;
		adhocTicketDAO = null;
		seasonTicketDAO = null;
	}
	
	@Test
	public void testInit() {
		assertTrue(iCarpark instanceof ICarpark);
		assertEquals(iCarpark.getName(), carparkId);
	
	}
	
	@Test(expected = RuntimeException.class)
	public void testConstructorWithNullName() {
		iCarpark = new Carpark(null, capacity, adhocTicketDAO, seasonTicketDAO);
		Assert.fail("Should throw an exception");
	}
	
	@Test(expected = RuntimeException.class)
	public void testConstructorWithEmptyName() {
		iCarpark = new Carpark("", capacity, adhocTicketDAO, seasonTicketDAO);
		Assert.fail("Should throw an exception");
	}
	
	@Test(expected = RuntimeException.class)
	public void testCapacityLessThanZero() {
		iCarpark = new Carpark(carparkId, -3 , adhocTicketDAO, seasonTicketDAO);
		Assert.fail("Should throw an exception");
	}

	
	@Test
	public void testRegister() {
		observers.removeAll(observers);
		observers.add(observer);
		assertEquals("Add object and check size", 1, observers.size());
	}
	
	
	
	@Test
	public void testDeregister() {
		observers.removeAll(observers);
		observers.add(observer);
		observers.remove(observer);
		assertEquals("Remove all, add one, remove one and check size", 0, observers.size());
	}

	
	
	
	
	
	@Test
	public void testIssueAdhocTicket() {
		assertEquals(adhocTicketDAO.createTicket(carparkId), iAdhocTicket);
	}
	
	@Test
	public void testGetAdhocTicket() {
		assertEquals(adhocTicketDAO.findTicketByBarcode("barcode"), iAdhocTicket);
	}
	
	@Test
	public void testRecordSeasonTicketEntry() {
		assertEquals(seasonTicketDAO.findTicketById("ticketId"), null);
	}
	

	
	
}
