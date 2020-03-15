/**
 * Binary Trees
 * @author arneetkalra
 *
 */
public class BST {
	 Tnode root;
	 
	 public void insert(int value) {
		 root = addRecursive(root,value);
	 }
	 
	 private Tnode addRecursive(Tnode current, int data) {
		 if (current == null) {
			 return new Tnode(data);
		 }
		 
		 if (data < current.data) {
			 current.left = addRecursive(current.left, data);
		 } 
		 else if (data > current.data) {
		
			 current.right = addRecursive(current.right, data);
		 } 
		 else {
			 //Value already exists
			 return current;
		 }
		
		 return current;
		 
	 }

	public static void preorderTraversal(BST tree) {
		System.out.print("The preorder traversal of this tree is: ");
		preorder(tree.root);
	}
	private static void preorder(Tnode root) {
		if(root != null) {
			System.out.print(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}
	}	
	
	public static void postorderTraversal(BST tree) {
		System.out.print("The postorder traversal of this tree is: ");
		postorder(tree.root);
	}
	private static void postorder(Tnode root) {
		if(root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+" ");
		}
	}	
	
	public static void inorderTraversal(BST tree) {
		System.out.print("The inorder traversal of this tree is: ");
		inorder(tree.root);
	}
	private static void inorder(Tnode root) {
		if(root != null) {
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	}
	
}
