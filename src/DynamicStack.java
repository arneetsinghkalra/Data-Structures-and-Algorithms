
public class DynamicStack {
	int capacity = 2;
	int stack[] = new int[capacity];
	int top = 0;
	
	public void push (int data) {
		if(size()==capacity) {
			expand();

		}
		stack[top] = data;
		top++;
	}

	private void expand() {
		//int length = size();
		int newStack[] = new int[capacity*2];
		System.arraycopy(stack, 0, newStack, 0, capacity);
		stack = newStack;
		capacity *= 2;
	}
	
	private void shrink() {
		capacity /= 2;
		
		int newStack[] = new int[capacity];
		System.arraycopy(stack, 0, newStack, 0, capacity);
		stack = newStack;
		capacity /= 2;
	}

	public void show() {
		for (int i=stack.length-1; i>=0; i--)
			System.out.print(stack[i] + " ");
			System.out.println("");
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is already empty.");
			return -1;
		}
			
		top--;
		int data = stack[top];
		stack[top] = 0;
		
		if(size() < capacity/2) {
			shrink();
		}
		return data;
	}
	
	public int peek() {
		top--;
		int data = stack[top];
		top++;
		return data;
	}
	
	public boolean isEmpty() {
		if (top == 0) {
			return true;
		}
		return false;
	}
	
	public int size() {
		return top;
	}
	
}
