public class LinkedListCall {
	public static void main(String args[]) {
		MyLinkedList<String> mylist = new MyLinkedList<>();
		mylist.addFirst("C");
		mylist.addLast("D");
		mylist.addFirst("B");
		mylist.addLast("E");
		mylist.addFirst("A");
		mylist.addLast("F");
		mylist.Swap(3, 5);
		mylist.RemoveAtEnd(3);
		
		System.out.println(mylist.toString());
		System.out.println(mylist.size());
	}
}
