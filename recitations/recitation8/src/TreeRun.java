import java.io.*;
import java.util.*;

public class TreeRun {
	
	static Random rnd = new Random();
	public static void main(String[] args) {
		  TreeNode<String> menu = new TreeNode("Computer Science");
	        TreeNode<String> item = menu.addChild("Courses");
	              item.addChild("Python");
	                item.addChild("Java");
	                item.addChild("Data Structure");
	            
	   item = menu.addChild("Faculty");     
	             item.addChild("Engel");
	                item.addChild("Korth");
	                item= item.addChild("Klukowska");
	                item.addChild("Section1");
	                item.addChild("Section2");
	             
	        menu.printTree(menu);
	    }

}
