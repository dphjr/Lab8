// This class implements a queue using a linked list
// It requires the LinkedNode class to be defined
public class LinkedQueue {

	LinkedNode front;
	LinkedNode rear;
	int count;

	LinkedQueue() {
		front = rear = null;
		count = 0;
	}

	void enqueue(int x) {
		LinkedNode newNode = new LinkedNode(x);
		if (rear != null)
			rear.next = newNode;
		else
			front = newNode;
		rear = newNode;
		count++;
	}

	int dequeue() {
		if (front == null) {
			return -1;
		}

		if (front != rear) {
			int x = front.x;
			front = front.next;
			count--;
			return x;
		} else {
			int x = front.x;
			front = null;
			rear = null;
			count--;
			return x;
		}
	}

	int first() {
		return front.x;
	}

	boolean isEmpty() {
		return count == 0;
	}

	int size() {
		return count;
	}

	void removeMiddle() {
		LinkedNode temp, current;

		//Checks if list is empty
		if (front == null) {
			return;
		} else {
			//initializes halfCount and stores the mid position
			int halfCount = (size() % 2 == 0) ? (size() / 2) : ((size() + 1) / 2);

			//Checks if front is equal to rear, then continues
			if (front != rear) {
				//Initially, temp will point to front
				temp = front;
				current = null;

				//assigns current to point at the node previous to temp
				for (int i = 0; i < halfCount - 1; i++) {
					current = temp;
					temp = temp.next;
				}
				if (current != null) {
					//temp is the middle node that needs to be removed.
					//current node will point to node after temp by skipping temp.
					current.next = temp.next; //removes temp
				}
			}
			count--;
		}
	}
}