/*
 *This program will check if the equation entered has proper correct opening and closing parenthesis or not.
 *Logic:
 *		This is achieved by adding the parenthesis to a stack and while adding:
 *									1. if the parenthesis is an opening one then -- push it to the stack.
 *									2. if the parenthesis is an closed one then -- pop the stack..this has sub conditions to it.
 *										 				1. if the stack is in underflow, while popping...then the equation is unbalanced.
 *									3. if the stack is not empty at the end of the addition operation then the stack still has some brackets left, which means that the equation is unbalanced.											 
 */

import java.util.Scanner;

public class parenthesis_valid {
	public stack_application.ListNode character;
	public int length;
	public int flag = 0;
	
	
	public void checkForValidation()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the equation: ");
		String eqn = sc.nextLine();
		char ch;
		for(int i = 0;i < eqn.length(); i++)
		{ 
			ch = eqn.charAt(i); //fetching each char from eqn 
			if(ch == '(' ||ch == '[' ||ch == '{' ) // matching for opening breaces...if found pushing onto stack
			{
			push(Character.toString(ch));
			}
			else if(ch == '}' ||ch == ']' ||ch == ')' ) // matching for opening breces...if found popping stack
			{
				pop(Character.toString(ch));
			}
		}
		
		if(character == null)  //checking the stack is empty after all the operations have been done
 		{
			System.out.println("\t\t\tEquation is balanced...");
		}
		else {
			if(flag != 1) // flag one coz....the pop function has already identified that the eqn is unbalanced...see pop() 
			System.out.println("\t\t\tUnbalanced Equation 2 !!!");
		}
		
		
	}
	
	public void push(String chars )
	{
		stack_application.ListNode temp = new stack_application.ListNode(chars);
		temp.next = character;
		character= temp;
		length += 1;
		
	//	System.out.println("\t\t\tParenthesis added !!!");
		
	}
	
	public void pop(String chars)
	{	
		try {
				character = character.next;
				length -= 1;
			}
	catch (NullPointerException e) // will give null pointer exception if a closing bracket is found...even when there is no opening bracket corresponding to it.
	{	
		System.out.println("\t\t\tUnbalanced Equation 1 !!!");
		flag = 1;
	}
	}
	

	public static void main(String[] args) {
		
		parenthesis_valid ob = new parenthesis_valid();
		ob.checkForValidation();
	}

}
