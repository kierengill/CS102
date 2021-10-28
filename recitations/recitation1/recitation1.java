public class recitation1{

	public static void main(String args[]){

		Car myCar = new Car("Fara", "Ma'ruf", "RH0ND4", 012345);
		System.out.println(myCar.firstName);
		System.out.println(myCar.licensePlate);
		myCar.charge();
		myCar.charge();
		myCar.charge();

		System.out.println();
		
		Truck myTruck = new Truck(4, "Doofenshmirtz Evil Incorporated", "D00F123", 696969);
		System.out.println(myTruck.ownerName);
		myTruck.charge();
		myTruck.charge();
		myTruck.charge();

		System.out.println();

		EmergencyVehicle myEMV = new EmergencyVehicle("Health Ministry", "SOS999", 000001);
		System.out.println(myEMV.ownerName);
		myEMV.charge();
		myEMV.charge();
		myEMV.charge();
	}

}