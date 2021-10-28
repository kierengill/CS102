
public class DoublyLinkedList{

  //---------------- nested Node class ----------------
  /**
   * Node of a doubly linked list, which stores a reference to its
   * element and to both the previous and next node in the list.
   */
  @SuppressWarnings("hiding")
private static class Node<String> {

    /** The element stored at this node */
    private String element;               // reference to the element stored at this node
    private Node<String> west;            // reference to the previous node in the list
    private Node<String> east;    
    private Node<String> north;            // reference to the previous node in the list
    private Node<String> south;

    /**
     * Creates a node with the given element and next node.
     *
     * @param e  the element to be stored
     * @param p  reference to a node that should precede the new node
     * @param n  reference to a node that should follow the new node
     */
    public Node(String e, Node<String> n, Node<String> s,  Node<String> ea, Node<String> w) {
      element = e;
      north = n;
      south = s;
      east = ea;
      west = w;
    }

    // public accessor methods
    /**
     * Returns the element stored at the node.
     * @return the element stored at the node
     */
    public String getElement() { return element; }
    public Node<String> getEast() { return east; }
    public Node<String> getWest() { return west; }
    public Node<String> getNorth() { return north; }
    public Node<String> getSouth() { return south; }

    // Update methods
    /**
     * Sets the node's previous reference to point to Node n.
     * @param p    the node that should precede this one
     */
    public void setEast(Node<String> ea) { east = ea; }
    public void setWest(Node<String> w) { west = w; }
    public void setNorth(Node<String> n) { north = n; }
    public void setSouth(Node<String> s) { south = s; }
    
  } //----------- end of nested Node class -----------

  

  /** Number of elements in the list (not including sentinels) */
  private Node<String> position;
  private Node<String> root = new Node<String>(null,null,null,null,null);
  
  /** Constructs a new empty list. */
  public DoublyLinkedList() {                   
  }
  
  public void Root(String letter) {
	    root = new Node<String>(letter,null,null,null,null);
	    position = root;                    
	  }

  public void Add(String letter, String direction) {
	  Node<String> newNode = new Node<String>(letter, null, null, null, null);
	  if (direction == "West") {position.setWest(newNode); newNode.setEast(position);}
	  else if (direction == "East") {position.setEast(newNode); newNode.setWest(position);}
	  else if (direction == "North") {position.setNorth(newNode); newNode.setSouth(position);}
	  else if (direction == "South") {position.setSouth(newNode); newNode.setNorth(position);}  
	  position = newNode;
  }
  
  public void Move(String direction) {
	  if (direction == "West") {position = position.getWest();}
	  else if (direction == "East") {position = position.getEast();}
	  else if (direction == "North") {position = position.getNorth();}
	  else if (direction == "South") {position = position.getSouth();}   
  }
  
  public void Print() {
	  Print(position,0);  
	  System.out.println();
  }
  
  public void Print(Node<String> position, int x) {
	  System.out.print(position.getElement());
	  if (position.getEast() !=null && x!=1) {System.out.print(","); Print(position.getEast(),2);}
	  if (position.getWest() !=null&& x!=2) {System.out.print(","); Print(position.getWest(),1);}
	  if (position.getSouth() !=null && x !=3) {System.out.print(","); Print(position.getSouth(),4);}
	  if (position.getNorth() !=null && x!=4) {System.out.print(","); Print(position.getNorth(),3);}
  }
  
  public void Lewis() {
	  String [][] myArr = new String[21][21];
	  for (int i = 0; i<21; i++) {
		  for (int j = 0; j<21; j++) {
			  myArr[i][j] = " ";
		  }
	  	}
	  int startX = 10;
	  int startY = 10;
	  myArr[startX][startY]= root.getElement();
	  	
	  Lewis(root,startX, startY, 0 , myArr);
	  
	  for (int i = 0; i<21; i++) {
		  System.out.println();
		  for (int j = 0; j<21; j++) {
			  System.out.print(myArr[i][j]);
		  }
	  }
  }
  
  public void Lewis(Node<String> position, int startX, int startY, int x, String[][] myArr) {
	  if (position.getEast() !=null && x!=1) {
		  myArr[startX][startY+1] = "-";
		  myArr[startX][startY+2] = position.getEast().getElement();
		  Lewis(position.getEast(),startX, startY+2, 2, myArr);
		  }
	  if (position.getWest() !=null&& x!=2) {
		  myArr[startX][startY-1] = "-";
		  myArr[startX][startY-2] = position.getWest().getElement();
		  Lewis(position.getWest(),startX, startY-2, 1, myArr);
		  }
	  if (position.getSouth() !=null && x !=3) {
		  myArr[startX+1][startY] = "|";
		  myArr[startX+2][startY] = position.getSouth().getElement();
		  Lewis(position.getSouth(),startX+2, startY, 4, myArr);
		  }
	  if (position.getNorth() !=null && x!=4) {
		  myArr[startX-1][startY] = "|";
		  myArr[startX-2][startY] = position.getNorth().getElement();
		  Lewis(position.getNorth(),startX-2, startY, 3, myArr);
		  }
  }
} //----------- end of DoublyLinkedList class -----------