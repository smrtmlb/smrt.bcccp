package test.tickets.adhoc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestAdhocTicketDAO {
	
	private Map<String, IAdhocTicket> currentTickets;
	private IAdhocTicketFactory adhocTicketFactory_;
	private int currentTicketNo;

	
		@Before
	public void testAdhocTicketDAO() {
		adhocTicketFactory_ = mock(iadhocTicketFactory_.class);
		currentTickets = new HashMap<>();
	}
	
		@After
	public void testAdhocTicketDAO() throws Exception {
		iadhocTicketFactory_ = null;
		
	}
	
	
	public Int testisCurrent() {
		IAdhocTicket ticket = adhocTicketFactory_.make(carparkId, ++currentTicketNo);
		currentTickets.put(ticket.getBarcode(), ticket);
		assertTrue(iticket instanceof iticket);
		assertEquals(iticket.getName(), ticket);
	
	}


}
