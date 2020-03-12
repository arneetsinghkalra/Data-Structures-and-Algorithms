/**
 * Class for Tree Nodes
 * @author arneetkalra
 *
 */
public class Tnode {
	int data;
	Tnode left;
	Tnode right;
	
	Tnode (){
		left = right = null;
	}
	
	Tnode(int d){
		data = d;
		left = right = null;
	}
}
