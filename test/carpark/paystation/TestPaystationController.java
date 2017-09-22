package test.carpark.paystation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

import bcccp.carpark.ICarpark;
import bcccp.carpark.paystation.IPaystationController;
import bcccp.carpark.paystation.IPaystationUI;
import bcccp.carpark.paystation.PaystationController;


public class TestPaystationController {
	
	IPaystationController iPaystationController;
	
	private IPaystationUI ui_;	
	private ICarpark carpark_;
	
	
	@Before
	public void setUp() {
		ui_ = mock(IPaystationUI.class);
		carpark_ = mock(ICarpark.class);
		iPaystationController = new PaystationController(carpark_, ui_);
		
	}
	
	@After
	public void tearDown() throws Exception {
		ui_ = null;
		carpark_ = null;
	}
	
	@Test(expected = RuntimeException.class)
	public void testConstructorWithNullUi() {
		iPaystationController = new PaystationController(carpark_, null);
		fail("Run time exception should be thrown.");
	}
	
	@Test(expected = RuntimeException.class)
	public void testConstructorWithNullCarPark() {
		iPaystationController = new PaystationController(null, ui_);
		fail("Run time exception should be thrown.");
	}
	
	@Test
	public void testTicketInserted() {
		iPaystationController.ticketInserted("");
		assertTrue(true);
	}
	
	@Test
	public void testTicketPaid() {
		iPaystationController.ticketPaid();
		assertTrue(true);
	}
	
	@Test
	public void testTicketTaken() {
		iPaystationController.ticketTaken();
		assertTrue(true);
	}
	
	
}
