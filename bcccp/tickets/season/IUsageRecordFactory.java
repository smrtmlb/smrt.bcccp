package bcccp.tickets.season;

// Interface usage record factory
public interface IUsageRecordFactory {

	public IUsageRecord make(String ticketId, long startDateTime);
}
