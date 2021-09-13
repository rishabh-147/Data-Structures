import java.util.Scanner;

public class Stack {

	private ListNode top;
	private int sizeOfStack;

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

	public Stack() 
	{	
		top = null;
		sizeOfStack = 0;
	}

	public boolean isEmpty(int size) 
	{
		return size <= sizeOfStack;
	}

	public void push(int size) 
	{	
		int value; 
		ListNode temp;
		Scanner sc = new Scanner(System.in);
			System.out.print("Enter the value to be pushed to stack: ");
			value = sc.nextInt();
			temp = new ListNode(value); /*jab pahli bar execution hoga to top poora null hoga...exist hi nahi kr raha hoga to temp.next null pe point krega.... lekin jb doosri baar ye push call hoga to ab temp.next top node ko point krega that means usse link ho jayega.... aur ab since temp link ho chuka hai current top se..so we can move top to new temp.... i.e top = temp naya node jo abhi abhi push hua h*/
			temp.next = top;
			top = temp;
			size += 1;
			
			}


	public void pop(int size) 
	{  
		try {
		ListNode temp = top;
		top = temp.next;
		size -= 1;
		System.out.println("\n\t\t\tPopped: " + temp.data);
		}
		catch(NullPointerException e) {
			System.out.println("\n\t\t\tStack Underflow !!!");
		}
	}

	public int length() 
	{
		int length = 0;
		while (top != null) 
		{
			length += 1;
			top = top.next;
		}
		return length;
	}

	public void peek() 
	{
		if (top != null)
			System.out.println("\n\t\t\t"+ top.data);
		else
			System.out.println("\n\t\t\tStack Underflow !!!");
	}

	public void display() 
	{	System.out.print("\n\t\t\t");
		ListNode dis = top;
		while (dis != null) 
		{
			System.out.print(dis.data + " --> ");
			dis = dis.next;
		}
		System.out.println("NULL");
	}

	// Create a stack using the concept of SINGLY LINKED LIST.

	// Create further functions performing diffrent task such as PUSH() POP()
	// PEEK();

	public static void main(String[] args) {

		Stack s = new Stack();
		int size = s.sizeOfStack;
		Scanner sc = new Scanner(System.in);
		String ch ="" ;
		while(!ch.equals("5"))
		{
			System.out.println("\n\nAvailable operations on the Stack are: \n1. push\n2. pop\n3. peek\n4. display");
			System.out.println("5.Enter 'Q' to exit.");
			System.out.print("Enter the name of operation: ");
		
			ch = sc.nextLine();
			switch(ch)
			{
				case "1":
				{				
					s.push(size);
					break;
				}
				case "2":
				{
					s.pop(size);
					break;
				}
				case "3":
				{
					s.peek();
					break;
				}
				case "4":
				{
					s.display();
					break;
				}
				default:
				{
					System.out.println("Enter a vailed input.");
				}
			}

		}

	}
}
