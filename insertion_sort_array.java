import java.util.Scanner;

/*
 * INSERTION SORT
 * ------------------------------------------------------------------------
 * Sorting the array using insertion sorting technique in ascending oder.
 * */
public class insertion_sort_array 
{
	private int array[];
	private int sizeOfArray;

	public void inputArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		sizeOfArray = sc.nextInt();
		
		array = new int[sizeOfArray];
		System.out.println("Enter the elemnts of the array: ");
		for(int i = 0; i < sizeOfArray; i++)
		{
			array[i] = sc.nextInt();
		}
	}
	
	public void insertion_sort()
	
	{
/*            ___|________________
		     | 9 | 8 | 5 | 2 | 7 |
		     |___|___|___|___|___|
		         |
			t1
			
			Here at i =1th loop, 8 will be compared to 9 and swapped, after that...
			
	      	 ________|____________
		     | 8 | 9 | 5 | 2 | 7 |
		     |___|___|___|___|___|
		             |
				t1
				Here at i =2th loop, now array[t2] =5, so 5 will be compared to 9 at j running 1st tym, then swaapped, 
				then again 5 will be compared from the new position i.e the position which 9 had b4, then 5 will be compared
			   to 8 and will be swapped .....and this is how 5 is inserted in the left array....this happens till size-1 th index.
*/
		
		int t1 = 1; // taken to re-initialize the value of t2 to the incremented value of t1....t1th index of array will be used to compare to the other left side members of the array
	
		for(int i= 1; i < sizeOfArray; i++) // This loop marks the boundary of the division between left and ri8 part of the array  ....from 1 coz, we need at least 1 element on the left of the array.
		{
			int t2 = t1;  //the position which will be inserted in sorted order in the left side...it is initially on the ri8 of the boundary
			for(int j = i-1; j >= 0; j--) // this loop will go backwards form the division boundary to 0th index simultaneously comparing the values and sorting them.
			{
				
				if(array[t2] < array[j] ) // t2 element is being compared to jth index
				{
					// swapping the members
					int temp = array[t2];
					array[t2] = array[j];
					array[j] = temp;
					//decreasing t2 to the left side coz after swapping it will come to the left of where it was previously
					t2 -= 1;
					
				}
				
			}
			t1 += 1; //increasing the boundary by 1 index; 
		}
	}
	
	public void display()
	{
		for(int i = 0; i < sizeOfArray; i++)
		{
			System.out.print("\t"+array[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		insertion_sort_array isa = new insertion_sort_array();
		
		isa.inputArray();
		System.out.print("The provided Array is: ");
		isa.display();
		System.out.print("\nThe sorted Array is: ");
		isa.insertion_sort();
		isa.display();	
	}
}





/*
 *OUTPUT
 *----------------------------
Enter the size of the array: 10
Enter the elements of the array: 
45
48
75
26
35
15
48
95
25
52
The provided Array is: 	45	48	75	26	35	15	48	95	25	52

The sorted Array is: 	15	25	26	35	45	48	48	52	75	95
 * */
 