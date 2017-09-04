package bcccp.carpark.entry;

//Interface Entry controller.
public interface IEntryController {

	public void buttonPushed();

	public void ticketInserted(String barcode);

	public void ticketTaken();

}
