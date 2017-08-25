package bcccp.carpark.paystation;

//Interface pay station controller
public interface IPaystationController {
	
	public void ticketInserted(String barcode);
	public void ticketPaid();
	public void ticketTaken();

}
