
public class Runner {

	public static void main(String[] args) { 
		
/****** Stack 
		Stack nums = new Stack();
		
		nums.push(15);
		nums.show();
		
		nums.pop();
		nums.show();
		
		nums.pop();
*/
/******* Dynamic Stack
		DynamicStack nums = new DynamicStack();
		nums.push(15);
		nums.show();
		nums.push(8);
		nums.show();

		nums.push(12);
		nums.show();

		nums.push(15);
		nums.show();

		nums.push(15);
		nums.show();

		nums.pop();
		nums.show();
		nums.pop();
		nums.show();
		nums.pop();
		nums.show();
		nums.pop();
		nums.show();
*/
//************** Linked List Practice
/*
		LinkedList list = new LinkedList();
		list.insert(5);
		list.insert(53);
		list.insert(21);
		list.insert(33);
		list.insert(46);
		list.show();
		list.insertAt(10, 2);
		System.out.println("");
		list.show();
		
		list.deleteIndex(0);
		System.out.println("");
		list.show();
*/
//**************Queue
/*
	Queue q = new Queue();
	q.enqueue(5);
	q.enqueue(10);
	q.enqueue(20);
	q.show();
	q.dequeue();
	q.show();
	}
*/
//*************** Doubly Linked List
/*
		DoublyLinkedList dlist= new DoublyLinkedList();
	
	dlist.insert(10);
	dlist.insert(20);
	dlist.insert(30);
	dlist.insert(40);
	//dlist.deleteAt(3);
	dlist.deleteFirst();
	dlist.show();
	dlist.insertAt(10, 0);
	dlist.insertFirst(5);
	dlist.show();
	dlist.insertLast(50);
	dlist.show();
*/
//****************** Binary Search Tree
		BST tree = new BST();
		
		tree.insert(10);
		tree.insert(5);
		tree.insert(6);
		tree.insert(20);
		tree.insert(18);
		tree.insert(19);
		tree.insert(1);
		tree.insert(3);
		tree.insert(30);

		//System.out.println(tree.root.right.data);
		tree.preorderTraversal(tree);
		System.out.println();
		tree.postorderTraversal(tree);
		System.out.println();
		tree.inorderTraversal(tree);
		
		System.out.println();
		System.out.println(tree.containsValue(30)); //Should be true
		System.out.println(tree.containsValue(31)); //Should be false
		
	}
}
