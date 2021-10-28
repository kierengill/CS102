import java.io.*;
import java.util.*;

public class Driver {
	static Random rnd = new Random();
	public static void main(String[] args) {
		TreeNode<String> menu = new TreeNode(Integer.toString((rnd.nextInt(10)) + 1));
		for (int i = 0; i < 3; i++) {
			TreeNode<String> layer1 = menu.addChild(Integer.toString((rnd.nextInt(10)) + 1));
			for (int l = 0; l < 3; l++) {
				TreeNode<String> layer2 = layer1.addChild(Integer.toString((rnd.nextInt(10)) + 1));
				for (int j = 0; j < 3; j++) {
					TreeNode<String> layer3 = layer2.addChild(Integer.toString((rnd.nextInt(10)) + 1));
					for (int k = 0; k < 3; k++) {
						TreeNode<String> layer4 = layer3.addChild(Integer.toString((rnd.nextInt(10)) + 1));
					}
				}
	        }
		}
		
		menu.PreTraversal(menu);
		System.out.println();
		menu.PostTraversal(menu);
		
	    }
	
}
