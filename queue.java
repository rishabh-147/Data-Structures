import java.util.Scanner;

/*
 * The program shows the implementation of Queue data structure using a LINKED LIST.
 * ---------------------------------------------------------------------------------
	 * Variable
		
		*linked node for front end of the queue
		*linked node for the rear end of the queue
	* Functions
		* Enqueue -- Insertion in the queue from the rear end
		* Dequeue -- deletion in the queue from the front end
		* Peek -- to see the element currently at the front end of the queue
		* display -- to see the complete queue.
	
*/
public class queue {
	

	private ListNode frontEnd;
	private ListNode rearEnd;
	private int sizeOfQueue = 0;;

	// LISTNODE INNER CLASS
			public class ListNode 
			{
				public int data;
				public ListNode next;
		
				public ListNode(int user_input) 
				{
					this.data = user_input;
					this.next = null;
				}
			}
	public boolean isEmpty()
	{
		return sizeOfQueue == 0;
	}
	public void enqueue()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value to be enqueued: ");
		int value = sc.nextInt();
		ListNode temp = new ListNode(value);
		
		if(isEmpty()) 
			frontEnd = temp; // first time only....
		else
			rearEnd.next = temp;
		rearEnd = temp;
		sizeOfQueue += 1;
	}
	
	public void display()
	{
		ListNode temp = frontEnd;
		System.out.print("\n\t\t\t\t\t\tExit");
		while(temp != null)
		{	
			System.out.print("<---"+temp.data);
			temp = temp.next;
		}
		
	}
	
	public void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty.");
		}
		else 
		{
			frontEnd = frontEnd.next;
			sizeOfQueue -= 1;
		}
	}
	
	public void peek()
	{
		System.out.println("\n\t\t\tCurrently value at front of the Queue: "+frontEnd.data);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		queue q = new queue();
		q.enqueue();
		q.enqueue();
		q.enqueue();
		q.enqueue();
		System.out.print("\t\t\tQueue after insertions: \t");
		q.display();
		System.out.println();
		q.dequeue();
		q.dequeue();
		System.out.println();
		System.out.print("\t\t\tQueue after 2 dequeue: \t");
		q.display();
		System.out.println();
		q.peek();
		System.out.println("\n\t\t\tThe size of the new queue is: "+q.sizeOfQueue);
	}

}
