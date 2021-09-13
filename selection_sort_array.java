import java.util.Scanner;

/*
 * Selection Sort 
 * ------------------------
 * Done in ascending order;
 * [LOGIC FOR ASCENDING ORDER ONLY]
 * In this, a min value is taken and is compared throughout the array, if a min value is found, 
 * then swapping is done between the positions of both the values, and the min is updated to the new min.
 * After every successful comparing through out the array. the left most index is locked as it has got the minimum possible value.
 * 
 * */
public class selection_sort_array {

	private int[] array;
	private int sizeOfArray;
	
	public void inputArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		sizeOfArray = sc.nextInt();
		
		array = new int[sizeOfArray];
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < sizeOfArray; i++)
		{
			array[i] = sc.nextInt();
		}
	}
	
	public void selection_Sort()
	{/*
		here, we run i from 0 - size-1, then we will make a[i] as minimum value of the array; now will run a nested loop from i - size-1.
		using an if condition, if a value lesser than the min is found then that value is swapped with the A[i]. This is done till the whole 
		array is sorted. 
		
		
	*/
		int min;
		for(int i = 0; i < sizeOfArray; i++)
		{
			min = array[i];
			for(int j = i; j < sizeOfArray; j++) // Reason for running it from i is, after complition of the loop the 'i'th index is locked.
			{
				if(array[j] < min)
				{
					min = array[j]; // updating the value od the min to the a[j]
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					
 				}
			}
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		selection_sort_array ssa = new selection_sort_array();
		
		ssa.inputArray();
		System.out.print("The provided Array is: ");
		ssa.display();
		ssa.selection_Sort();
		System.out.print("\nThe sorted Array is: ");
		ssa.display();
	}

}

/*
 * OUTPUT
 * --------------
 Enter the size of the array: 5
Enter the elements of the array: 
85
46
635
152
84
The provided Array is: 	85	46	635	152	84

The sorted Array is: 	46	84	85	152	635
 
 */
