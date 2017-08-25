package bcccp.carpark;

//Interface car sensor responder
public interface ICarSensorResponder {
	
	public void carEventDetected(String detectorId, boolean detected);

}
