public class Truck extends EmergencyVehicle{
	public Integer axle;

public Truck(Integer inAxle, String inCorpName, String inLicense, Integer inAccNumber){
	super(inCorpName, inLicense, inAccNumber);
	axle = inAxle;
	balance = 0;
}

public void charge(){
	balance += (axle*3);
	System.out.println("Remaining balance owed for " + ownerName + "'s truck is " + Integer.toString(balance));
}
}
