import java.util.Arrays;

public class MinIntHeap {
	
	public static void main () {
		MinIntHeap heap = new MinIntHeap();
		heap.add(5);
		heap.add(6);
		heap.add(7);
		
	}
	private int capacity = 10; //Capacity of array (aka our heap)
	private int size = 0; //Size of our array (aka our heap)

	int[] items = new int[capacity]; //The heap itself is implemented as an array
	
	// Methods to get indices, check to see if node exists, and get value stored at index

	private int getLeftChildIndex (int parentIndex) {return parentIndex * 2 + 1;};
	private int getRightChildIndex(int parentIndex) {return parentIndex * 2 + 2;};
	private int getParentIndex(int childIndex) {return (childIndex-1)/2;};

	private boolean hasLeftChild (int parentIndex) {return getLeftChildIndex(parentIndex) < size;}
	private boolean hasRightChild (int parentIndex) {return getRightChildIndex(parentIndex) < size;}
	private boolean hasParent(int childIndex) {return getParentIndex(childIndex) > -1;};

	private int getLeftChild(int parentIndex)  {return items[getLeftChildIndex(parentIndex)];}
	private int getRightChild(int parentIndex) {return items[getRightChildIndex(parentIndex)];}
	private int getParent(int childIndex) {return items[getParentIndex(childIndex)];}

	private void swap (int indexOne, int indexTwo) {
		int temp = items[indexOne];
		items[indexOne] = items[indexTwo];
		items[indexTwo] = temp;
	}

	private void ensureExtraCapacity(){
		if (size == capacity) {
			items = Arrays.copyOf(items, capacity * 2);
			capacity = capacity * 2;
		}
	}
	
	//Take a look at what the root element is 
	public int peek (){
		if (size == 0) throw new IllegalStateException();
		return items[0];
	}

	//Take a look at the root element AND remove it
	public int poll() {
		if (size == 0) throw new IllegalStateException(); //If empty just give an exception
		int root = items[0]; //Get top most element
		items[0] = items[size - 1]; //Replace root with the last element in the array
		size--; //Decrease size of array as we have removed an element
		heapifyDown(); //Bubble down the new root node to its right spot
		return root;
	}

	public void add(int item) {
		ensureExtraCapacity(); //Make sure we have enough space for another element, otherwise double cap
		items[size] = item;
		size++;
		heapifyUp(); //Bubble up so that its in the right spot
	}

	public void heapifyUp() {
		int index = size - 1;
		while (hasParent(index) && getParent(index) > items[index]) {
			//Swap method takes in index input and switches the values located at these indices
			swap(index,getParentIndex(index)); 
			index = getParentIndex(index);
		}
	}

	public void heapifyDown() {
		int index = 0;

		/*
		Only need to check if there exists a left child, because there can't be a right child 
		without a left child in a properly maintained heap.
		*/
		while (hasLeftChild(index)){
			//Now get the index of the smaller value child
			int smallerChildIndex = getLeftChildIndex(index);
			if(hasRightChild(index) && getRightChild(index) < getLeftChild(index)) {
				smallerChildIndex = getRightChildIndex(index);
			}
			
			//Swap index with smaller child if the current value is greater than that of the child
			if (items[index] > items[smallerChildIndex]) {
				swap(index, smallerChildIndex);
				index =  smallerChildIndex;
			}

			//Otherwise break out of the while loop because you're done
			else break;
		}

	}
}
