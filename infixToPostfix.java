/*
This is the program to convert infix to post fix equation.
Logic:
-------> We have fetched out each character from the equation and have followed the following conditions:
		---->1. if the character coming is an operator then:
													---->1. if the stack is empty, add the operator to the stack.
													---->2. after entering the first operator into the stack...push() the char operator to the stack.
													----> else:
															---->1. if the next coming operator is of higher precedence then the operator currently on the stack then push() this operator to the stack.
		 													---->2. if the next coming operator is of lower precedence then the stack operator then pop() the stack operator add it to the postfix eqn and then push() this newly arrived operator ontp the stack.
		 											----> This will arrange them all in the post fix notation. 
*/

import java.util.Scanner;
public class infixToPostfix {
	
	public stack_application.ListNode stack;
	public String infixEqn;
	public String postfixEqn = "";
	
	public int precedence(char operator)
	{
		 if(operator == '*') return 4;
		else if(operator == '/') return 3;
		else if(operator == '+') return 2;
		else if(operator == '-') return 1;
	
		else return 0;
	}

	public void conversion1()
	{  // taking infix equaition from the user and matching the operators and performing the further task
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the equation: ");
		 infixEqn = sc.nextLine();	
		char ch;																										
		for(int i = 0;i < infixEqn.length(); i++)
		{  
			ch = infixEqn.charAt(i); //fetching each char from eqn 
			if(ch == '*' ||ch == '/' ||ch == '+'||ch == '-' ) // matching for operators..
			{   
				if(stack == null)push(Character.toString(ch));
				else conversion2(ch);
			}
			else 																					
			{
				postfixEqn = postfixEqn + ch;
			}
		}
		if(stack != null)
		{
			while(stack != null)
			{
				postfixEqn = postfixEqn + stack.data;
				stack = stack.next;
			}
		}
	}
	
	
	public void conversion2(char ch)
	{ // checking the precedence and performing the required task based on the conditions
		
		if(precedence(ch) > precedence(stack.data.charAt(0)))
		{
		//	System.out.println(stack.data.charAt(0));
			push(Character.toString(ch));
		}
		else if(precedence(ch) < precedence(stack.data.charAt(0)))
		{
			System.out.println(stack.data.charAt(0));
			char popped = pop();
			postfixEqn = postfixEqn + popped;
			push(Character.toString(ch));
		}
		
		else {
			postfixEqn = postfixEqn + ch;
		}
		
	}
		
		public void push(String chars )
		{
			stack_application.ListNode temp = new stack_application.ListNode(chars);
			temp.next = stack;
			stack= temp;
			
			
		//	System.out.println("\t\t\tParenthesis added !!!");
			
		}
		
		public char pop()
		{   char ch = stack.data.charAt(0);
			stack = stack.next;
			return ch;
		//	System.out.println("\t\t\tItem popped !!!");
		}
		
	public static void main(String[] args) {
		infixToPostfix ip = new infixToPostfix();
		ip.conversion1();
		System.out.println("\n\t\tThe given Infix equation is: "+ip.infixEqn);
		System.out.println("\n\t\tThe Postfix equation for the given infix is: "+ip.postfixEqn);
		
	}

}
