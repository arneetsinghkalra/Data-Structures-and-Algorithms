
public class Queue {
	int queue[] = new int[5];
	int size;
	int front;
	int rear;
	
	public void enqueue(int data) {
		queue[rear] = data;
		rear++;
		size++;
		
	}
	
	public void show() {
		int i;
		for (i = 0; i<size; i++) {
			
		}
	}
}
