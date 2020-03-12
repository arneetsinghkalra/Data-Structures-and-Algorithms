
public class DoublyLinkedList {
	Node head;
	
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		
		//If this is your first node then set head as the node
		if(head==null) {
			head = node;
		}
		
		//Some nodes already exist
		else {
			Node n = head;
			//Traverse the linked list till you get to the last element
			while(n.next != null) {
				n = n.next;
			}
			//Set the next node to the node you just created
			n.next = node;
			node.prev = n; //Set previous node to the n
		}
	}
	
	public void insertAt(int data, int index) {
		Node node = new Node(data);
		
		if (index == 0) {
			insertFirst(data);
		}
		
		else { 
			//Traverse to node before 
			Node n = head;
			int i = 0;
			while (i < index -1) {
				n = n.next;
				i++;
			}
			node.prev = n;
			node.next = n.next;
			n.next.prev = node;
			n.next = node;	
		}
	}
	
	public void insertFirst(int data) {
		Node node = new Node();
		node.data = data;
		node.next=null;
		node.prev = null;
		
		node.next = head;
		head.prev = node;
		head = node;
	}
	
	public void insertLast(int data) {
		Node node = new Node(data);
		Node n = head;
		int i = 0 ;
		
		//Traverse to last node
		while (i< size() - 1) { 
			n = n.next;
			i++;
		}
		n.next = node;
		node.prev = n;
	}

	public void deleteAt(int index) {
		if (index > size()-1) {
			System.out.println("Not enough elements!");
			return;
		}
		Node n = head;
		int i = 0;
		
		if (index == size()-1) {
			deleteLast();
		}
		
		else {
			while (i<index-1) {
				n = n.next;
				i++;
			}
			n.next.next.prev = n;
			n.next = n.next.next;
		}
	}
	
	public void deleteLast() {
		Node n = head;
		int i = 0;
		
		while (i<size()-2) {
			n = n.next;
			i++;
		}
		n.next = null;
	}
	
	public void deleteFirst() {
		head.next.prev = null;
		head = head.next;
	}
	
	public void show() {
		Node n = head;
		while(n != null) {
			System.out.print(n.data+" ");
			n = n.next;
		}
		System.out.println("");

	}
	
	public int size() {
		Node n = head;
		int size = 0;
		while(n != null) {
			size++;
			n = n.next;
		}
		return size;
	}
}
