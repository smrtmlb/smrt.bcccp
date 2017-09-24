package bcccp.carpark.paystation;

//Interface Pay station UI
public interface IPaystationUI {
	public void registerController(IPaystationController controller);
	public void deregisterController();
	
	public void printTicket(String carparkId, int ticketNo, long entryTime, long paidTime, float charge, String barcode);
	public void display(String message);
	public void beep();

}
