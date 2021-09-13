import java.util.Scanner;

/*
 *Sorting in the Ascending order...small to big
 *for descending  order change the conditional operator to '<' at line no. 32.
 * */
public class bubble_Sort_array {
	private int[] array;
	private int size;
	
	
	@SuppressWarnings("resource")
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Array to be sorted: ");
		size = sc.nextInt();
		System.out.println("Enter the "+size+" elements below: ");
		array = new int[size];
		
		for(int i = 0; i < size; i++)
		{
			array[i] = sc.nextInt();
		}
	}
	
	private void bubble_sort()
	{
		for(int i = 0; i < size; i++)
		{
			for(int j = 0; j < size-i-1; j++)
			{
				if(array[j] > array[j+1] )
				{
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	
	public void display()
	{
		for(int i = 0; i < size; i++)
		{
			System.out.print("\t"+array[i]);
		}
	}
	public static void main(String[] args) {
		// object of the class
		bubble_Sort_array bs = new bubble_Sort_array();
					
		//Insertion
		bs.input();
		//display the entered array
		System.out.print("The provided Array is: ");
		bs.display();
		//Sorting in Ascending order
		bs.bubble_sort();
		//display the sorted array
		System.out.print("\nThe sorted Array is: ");
		bs.display();
	}

}



/*	OUTPUT
 * ---------
	 *  Enter the size of the Array to be sorted: 10
		Enter the 10 elements below: 
		75
		85
		45
		36
		15
		25
		48
		59
		62
		21
		The provided Array is: 	75	85	45	36	15	25	48	59	62	21
		The sorted Array is: 	15	21	25	36	45	48	59	62	75	85
*/
