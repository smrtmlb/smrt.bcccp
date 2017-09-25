package test.carpark.exit;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import bcccp.carpark.Carpark;
import bcccp.carpark.ICarSensor;
import bcccp.carpark.ICarSensorResponder;
import bcccp.carpark.IGate;
import bcccp.carpark.exit.ExitController;
import bcccp.carpark.exit.IExitController;
import bcccp.carpark.exit.IExitUI;
import bcccp.tickets.adhoc.IAdhocTicket;

public class TestExitController {
	
	IExitController iExitController;
	ICarSensorResponder iCarSensorResponder;
	
	private IGate exitGate;
	private ICarSensor is;
	private ICarSensor os; 
	private IExitUI ui;
	
	private Carpark carpark;
	private IAdhocTicket  adhocTicket = null;
	private long exitTime;
	private String seasonTicketId = null;
		
	@Before
	public void setUp() {
		exitGate = mock(IGate.class);
		is = mock(ICarSensor.class);
		os = mock(ICarSensor.class);
		ui = mock(IExitUI.class);
		
		carpark = mock(Carpark.class);
		adhocTicket = mock(IAdhocTicket.class);
		
		iExitController = new ExitController(carpark, exitGate, is, os, ui);
		iCarSensorResponder = new ExitController(carpark, exitGate, is, os, ui);
	}
	
	@After
	public void tearDown() throws Exception {
		exitGate = null;
		is = null;
		os = null;
		ui = null;
		carpark = null;
		adhocTicket = null;
	}
	
	
	@Test
	public void testInit() {
		assertTrue((iExitController instanceof IExitController));
		
		
	}	
	@Test(expected = RuntimeException.class)
	public void testConstructorWithNullCarPark() {
		iExitController = new ExitController(null, exitGate, is, os, ui);
		fail("Run time exception should be thrown.");
	}
	@Test(expected = RuntimeException.class)
	public void testConstructorWithNullExitGate() {
		iExitController = new ExitController(carpark, null, is, os, ui);
		fail("Run time exception should be thrown.");
	}
	@Test(expected = RuntimeException.class)
	public void testConstructorWithNullIsensor() {
		iExitController = new ExitController(carpark, exitGate, null, os, ui);
		fail("Run time exception should be thrown.");
	}
	@Test(expected = RuntimeException.class)
	public void testConstructorWithNullISensorSecond() {
		iExitController = new ExitController(carpark, exitGate, is, null, ui);
		fail("Run time exception should be thrown.");
	}
	@Test(expected = RuntimeException.class)
	public void testConstructorWithNullExitUi() {
		iExitController = new ExitController(carpark, exitGate, is, os, null);
		fail("Run time exception should be thrown.");
	}	
	
	@Test
	public void testCarEventDetected() {
		iCarSensorResponder.carEventDetected("1", true);
		equals(true);
	}
	
	
	@Test
	public void testTicketInserted() {
		iExitController.ticketInserted("Aticket");
		assertTrue(true);
	}
	
	@Test
	public void testTicketTaken() {
		iExitController.ticketTaken();
		assertTrue(true);
	}
}
