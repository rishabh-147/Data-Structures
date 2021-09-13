
public class count_sort_array {

	public void count(int[] A, int length) {
		// find max element in the given array;
		// create a new array of the length = MAX
		int MAX = max(A);
		int[] temp = new int[MAX + 1]; //max +1 because the indexes would start from 0 and if we create till MAX then we wont be able to find the MAX at the time of counting as the array will have the size of MAX-1
		for (int i = 0; i < temp.length; i++) {
			temp[i] = 0;
		}
		// traverse the original array and B[A[i]] = c
		for (int i = 0; i < length; i++) {
			int index = A[i];
			temp[index] += 1;
		}
		// copy the values with >1 elements in the B[] to a new array C[].
		display(copy(temp, length));
	}

	public int max(int[] A) {
		int max = A[0];
		for (int i = 0; i < A.length; i++) {
			if (max < A[i]) {
				max = A[i];
			}

		}
		return max;
	}

	public int[] copy(int[] A, int lengthOfOriginalArray) {
		int[] B = new int[lengthOfOriginalArray];
		int c = 0; // to traverse 1 by 1 index in new array
		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0) { //check if the value at 'i'th is > 0; then only it will be included in the final array 
				while (A[i] > 0) {//for the duplicate values the 'i'th index may be gr8ter then 1.
					B[c] = i; 
					A[i]--;
					c++;
				}
			}
		}
		return B;
	}

	public void display(int[] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		count_sort_array csa = new count_sort_array();
		int[] Array = { 8, 7, 9, 5, 2, 4, 6, 14, 5, 0 };
		csa.count(Array, Array.length);
	}

}
