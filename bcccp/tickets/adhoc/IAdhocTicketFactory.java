package bcccp.tickets.adhoc;

// Interface adhoc ticket factory
public interface IAdhocTicketFactory {

	public IAdhocTicket make(String carparkId, int ticketNo);

}
