package newproject;

public class Driver {
	public static void main(String args[]) {
		DoublyLinked<String> mylist = new DoublyLinked<>();
		mylist.addFirst("C");
		mylist.addLast("D");
		mylist.addFirst("B");
		mylist.addLast("E");
		mylist.addFirst("A");
		mylist.addLast("F");
		mylist.SwapEnds();
		mylist.SwapMiddle();
		
		System.out.println(mylist.toString());
	}
}
