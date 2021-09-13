import java.util.Scanner;

//This is an application of stack,which is used in browsers to keep the record of the web pages visited by the user.
public class stack_application {
	
	private ListNode top;
	private int sizeOfStack;
	
		public static class ListNode
		{
			public String data;
			public ListNode next;
			
			public ListNode(String history)
			{
				this.data = history;
				this.next = null;
			}
		}
		
		public void push()
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the value to be pushed: ");
			String history = sc.nextLine();
			
			ListNode temp = new ListNode(history);
			temp.next = top;
			top = temp;
			sizeOfStack += 1;
			
			System.out.println("\t\t\tItem added !!!");
			
		}
		
		public void pop()
		{
			top = top.next;
			sizeOfStack -= 1;
			
			System.out.println("\t\t\tItem popped !!!");
		}
		
		public void display()
		{
			ListNode temp = top;
			while(temp != null)
			{	
				System.out.println("\t\t\t"+temp.data);
				temp = temp.next;
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack_application s = new stack_application();
		
		Scanner sc = new Scanner(System.in);
		String ch ="" ;
		System.out.println("\n\nAvailable operations on the Stack are: \n1. push\n2. pop\n3. display");
		System.out.println("4.Enter 'Q' to exit.\n");
		
		while(!ch.equals("4"))
		{
			System.out.print("Enter the name of operation: ");
			ch = sc.nextLine();
			switch(ch)
			{
				case "1":
				{				
					s.push();
					break;
				}
				case "2":
				{
					s.pop();
					break;
				}
				
				case "3":
				{
					s.display();
					break;
				}
				case "4":
				{
					System.out.println("\t\t\tExit !!!");
				}
				default:
				{
					System.out.println("Enter a vailed input.");
				}
			}

		}
	}

}
