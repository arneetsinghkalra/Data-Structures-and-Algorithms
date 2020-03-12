
public class Stack {
	
	int stack[] = new int[5];
	int top = 0;
	
	public void push (int data) {
		if(top==5) {
			System.out.println("Stack is Full");
		}
		else {
		stack[top] = data;
		top++;
		}
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
	
