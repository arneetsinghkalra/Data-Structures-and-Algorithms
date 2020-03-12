
public class SinglyLinkedList {
	
	Node head;
	
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
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
		}
	}
	
	//Method to print all values in the list
	public void show() {
		Node n = head;
		while(n != null) {
				System.out.print(n.data+" ");
				n = n.next;
			
		}
	}
	
	public void insertAtStart(int data) {
		Node node = new Node(); //Make a new node
		node.data = data; //Give the data to the node
		node.next = head; //Set the next node to the current head
		head = node; //Set the node as the new head
	}
	
	public void insertAt(int data, int index) {
		int i = 0;
		//Create new node needed
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		//Get copy of head node
		Node n = head;
		//Just need to place it at the start in that case
		if(index == 0) {
			insertAtStart(data);
			return;
		}
		
		//Get to the node which is before where you want to place it
		while (i < index-1) {
			n = n.next;
			i++;
		}
		//Set the next node of new node to the node after previous existing node
		node.next = n.next;
		//Set the next node of previous existing node to the newly created node
		n.next = node; 
	}
	
	public void deleteIndex(int index) {
		Node n = head;
		int i = 0;
		if (index == 0) {
			head = head.next;
			return;
		}
		//Get to the node which is before where you want to place it
		while (i < index-1) {
			n = n.next;
			i++;
		}
		//Set the next node to the one 2 nodes down, so get rid of node in between
		n.next = n.next.next;
	}
	

	
}
