

// This class implements a Stack ADT as a linked list
public class LinkedStack {
	LinkedNode front;  // Reference to the first LinkedNode in the list
	int count;         // Number of nodes in the list
	
	// Constructor - initializes the front and count variables
	LinkedStack() {
		front = null;
		count = 0;
	}
	
	// Implements the push operation
	void push(int x) {
		LinkedNode newNode = new LinkedNode(x);
    	newNode.next = front;
    	front = newNode;
    	count++;
	}
	
	// Implements the pop operation
	int pop() {
		int x = front.x;
		front = front.next;
		count--;
		return x;
	}
	
	// Implements the peek operation
	int peek() {
		return front.x;
	}
	
	// Implements the isEmpty operation
	boolean isEmpty() {
		return front==null;
	}
	
	// Implements the size operation
	int size() {
		return count;		
	}
	
	// This method returns a String containing
	// a space separated representation of the underlying linked list
	public String toString() {
		String str = "";
		
		LinkedNode cur = front;
		while (cur!=null) {
			str += cur.x + " ";
			cur = cur.next;
		}
		
		return str;
	}

	//Exercise 2 modification
	void removeBottomHalf() {
		LinkedStack newStack = new LinkedStack();
		int fullCount = count;
		int halfCount = count/2;

		//creates inverse stack so that we can begin removing from the "bottom"
		for (int i = 0; i < fullCount; i++){
			newStack.push(pop());
		}
		//removes the "bottom" half of the inverse stack
		for (int i = 0; i < halfCount; i++) {
			newStack.pop();
		}
		//returns inverse stack to the original order
		while (newStack.size() < halfCount) {
			push(newStack.pop());
		}
		//test to make sure this works haha
		System.out.println("\n" + newStack);

		//I believe the time complexity would be O(2n). The first loop would be O(n) if n is = to count
		//After this, count gets divided in half so for the next two loops it would be O(n/2) each
		//O(n/2) + O(n/2) = O(n)
		//O(n) + [Loop 1] = O(2n)
	}
}
