package bcccp.tickets.adhoc;

import java.util.List;

// Interface adhoc ticket dao
public interface IAdhocTicketDAO {

	public IAdhocTicket createTicket(String carparkId);

	public IAdhocTicket findTicketByBarcode(String barcode);

	public List<IAdhocTicket> getCurrentTickets();

}
