
public class merge_sort_array {
	// function recurring and splitting the array
	// function to merge the split array sorting it simultaneously
	
	//													   0 1 2  3  4 5 6 7  8
	int a[] = {1,2,23,15,8,6,5,12,84};
	//1. l =0;m=4,u=8
	private int[] B;
	
	
	public void merge_sort(int[] a, int lb, int ub)
	{
		while(lb < ub)
		{
			int mid = (lb + ub) / 2;
			
			merge_sort(a, lb, mid);
			merge_sort(a, mid + 1, ub);
			
			merge_key(a, lb, mid, ub);
		}
	}
	
	public void merge_key(int[] A, int lb, int mid, int ub)
	{
		int i = lb, j = mid + 1, k = ub, c = 0;
		
		while(i < k && j < k)
		{
			if(A[i] <= A[j])
			{
				B[c] = A[i];
				i++;
			}
			else
			{
				B[c] = A[j];
				j++;
			}
			c++;
		}
		if(i < mid)
		{
			while(i == mid)
			{
				B[c] = A[i];
				i++;c++;
			}
		}
		if(j < ub-1)
		{
			while(j == ub-1)
			{
				B[c] = A[j];
				j++;c++;
			}
	}
		
	}
	
	public void display(int[] temp)
	{
		for(int i = 0; i < temp.length;i++) 
		{
			System.out.print(temp[i]+" ");
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		merge_sort_array msa = new merge_sort_array();
		msa.B = new int[msa.a.length];
		msa.display(msa.a);
		
		msa.merge_sort(msa.a, 0, msa.a.length);
		
		msa.display(msa.B);
		
	}

}
