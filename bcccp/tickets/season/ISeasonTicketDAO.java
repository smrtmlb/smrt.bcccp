package bcccp.tickets.season;

// Interface season ticket dao.
public interface ISeasonTicketDAO {

	public void registerTicket(ISeasonTicket ticket);

	public void deregisterTicket(ISeasonTicket ticket);

	public int getNumberOfTickets();

	public ISeasonTicket findTicketById(String ticketId);

	public void recordTicketEntry(String ticketId);

	public void recordTicketExit(String ticketId);
}
