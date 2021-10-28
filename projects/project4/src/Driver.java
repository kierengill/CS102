
public class Driver {
	public static void main(String[] args) {
		DoublyLinkedList myList = new DoublyLinkedList();	
		myList.Root("N");
		myList.Add("C", "East");
		myList.Add("A", "South");
		myList.Move("North");
		myList.Move("West");
		myList.Add("K", "South");
		myList.Add("M", "West");
		myList.Print();
		myList.Lewis();
	}
}
