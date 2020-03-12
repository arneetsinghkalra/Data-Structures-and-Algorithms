/**
 * Binary Trees
 * @author arneetkalra
 *
 */
public class BinaryTree {
	Tnode root;
	
	public void insert(int data) {
		Tnode node = new Tnode(data);
		
		if(root == null) {
			root = node;
		}
		
		else if (root.left == null) {
			root.left = node;
		}
		else if (root.right == null) {
			root.right = node;
		}
		
		root = root.left;
		insert(data);
	}
}
