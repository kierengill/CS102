public class EmergencyVehicle extends Vehicle{
	public String ownerName;

public EmergencyVehicle(String inGovOwner, String inLicense, Integer inAccNumber){
	ownerName = inGovOwner;
	licensePlate = inLicense;
	accountNumber = inAccNumber;
	balance = 0;
}

public void charge(){
	balance = 0;
	System.out.println("Remaining balance owed for " + ownerName + "'s emergency vehicle is " + Integer.toString(balance));
}
}