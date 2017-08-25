package bcccp.tickets.season;

// Interface usage record.
public interface IUsageRecord {
	
	public void finalise(long endDateTime);
	public long getStartTime();
	public long getEndTime();
	public String getSeasonTicketId();

}
