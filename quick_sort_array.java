public class quick_sort_array
{
  public int[] A = {5,8,6,9,5};
  
  public static void main(String[] args)
  {
	quick_sort_array qsa = new quick_sort_array() ;
	qsa.display();
	qsa.quick_sort(qsa.A, 0, (qsa.A.length -1) );
	qsa.display();
	
  }
  
  public int partition(int[] a, int low, int high)
  {
	  int pivot = a[low];
	  int i = low ;
	  int j = high;
	  int temp;
	do
		 {
		  	while(a[i] < pivot)
		  	{
		  		i++;
		  		System.out.println("ii");
		  	}
		  	
		 while(a[j] > pivot)
		  	{
		  		j--;
		  		System.out.println("jj");
		  	}
		  	
		  //interchanging i and j;
		  	
		  temp = a[i]; 
		  a[i] = a[j];
		  a[j] = temp;
	
		 
	 	}  while(i < j);
	  System.out.println("0000");
		 //interchanging the pivot with j, to bring pivot to it's respective position in the sorted array.
		 temp = a[low];
		 a[low] = a[j];
		 a[j] = temp;
	 return j;
	}
	  
  public void quick_sort(int[] a, int low, int high)
  { int partitionIndex;
   
  if(low <= high)
	  {
	  partitionIndex = partition(A, low, high); // array index of the pivot   
		  quick_sort(A, 0, partitionIndex - 1); // Left side of the pivot
		  display();
		  quick_sort(A, partitionIndex + 1, high); // right side of the pivot
	  }
  }
  
  public void display()
  {
	  for(int i = 0; i < A.length; i++)
	  {
		  System.out.print(A[i]+" ");
	  }
	  System.out.println();
  }
  
}