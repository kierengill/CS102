public class Car extends Vehicle{
	public String firstName;
	public String lastName;

public Car(String inFirst, String inLast, String inLicense, Integer inAccNumber){
	firstName = inFirst;
	lastName = inLast;
	licensePlate = inLicense;
	accountNumber = inAccNumber;
	balance = 0;
}

public void charge(){
	balance += 5;
	System.out.println("Remaining balance owed for " + firstName + " "+ lastName + "'s car is " + Integer.toString(balance));
}
}