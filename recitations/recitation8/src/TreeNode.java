
public class TreeNode<T> {
   private T value = null;
   private TreeNode[] children  = new TreeNode[100];
   
   private int childCount = 0;
   

    TreeNode(T value) {
        this.value = value;
    }
  
    public TreeNode<T> addChild(T value) {
        TreeNode<T> newChild = new TreeNode<T>(value);
        children[childCount++] = newChild;
        return newChild;
    }
     // starter method for various traversal prints
     void traverse(TreeNode<T> startnode) {	  
        if (startnode != null) {	
       	for (int i = 0; i < startnode.childCount; i++) {
       		System.out.println(startnode.children[i].value);
                traverse(startnode.children[i]);  
            }
        }
        return;
    }
     
     void newtraverse(TreeNode<T> startnode) {
    	 if (startnode == null) {
    		 return;
    	 }
         if (startnode != null) {	
        	for (int i = 0; i < startnode.childCount; i++) {
        		newtraverse(startnode.children[i]); 
        		System.out.println(startnode.children[i].value);
             }
         }
         return;
     }
     
     boolean findValue(TreeNode<T> startnode, int input) {
         if (startnode != null) {	
        	int x = Integer.parseInt(startnode.value.toString());
        	if (x==input) {
        		System.out.println("yes");
        		return true;
        	}else {
            	for (int i = 0; i < startnode.childCount; i++) {
            		if(findValue(startnode.children[i], input)) {
            			return true;
            		}
                 }
        	}      	  
         }
         return false;
     }
     
     void PreTraversal(TreeNode<T> obj) { 
    	 	System.out.println(obj.value);
         	traverse(obj);
         }
     
     void PostTraversal(TreeNode<T> obj) { 
      	newtraverse(obj);
 	 	System.out.println(obj.value);
      }

    

    void printTree(TreeNode<T> obj) { 
        traverse(obj);
        System.out.println(obj.value);
    }

}