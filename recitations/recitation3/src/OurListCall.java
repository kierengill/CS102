import java.util.Random;

public class OurListCall {

	 
	public static void main(String[] args) {
		    BookArrayList<Integer> mylist = new BookArrayList<Integer>(10);
		    mylist.add(0,3);
		    mylist.add(0,4);
		    mylist.add(0,5);
		    mylist.add(0,6);
		    mylist.add(0,2);
		    mylist.Switch();
		    mylist.Swap(2,4);
		    System.out.println(mylist.toString());
		    
		    BookArrayList<NYUStudent> roster = new BookArrayList<NYUStudent>(10);
		    roster.add(0,new NYUStudent("abc","123"));
		    roster.add(0,new NYUStudent("def","456"));
		    roster.add(0,new NYUStudent("ghi","789"));
		    roster.add(0,new NYUStudent("jkl","ABC"));
		    
		    System.out.println(roster.toString());
		    
		    Random r = new Random();
		    NYUStudent winner = roster.get(r.nextInt(roster.size()));
		    System.out.println("Winner is: " + winner.toString());
	}
}
