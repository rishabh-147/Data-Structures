
import java.util.Scanner;
import java.util.*;;

public class SubsetOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		
		Set<String> subsets = new TreeSet<>();
		
		System.out.print("Enter the length of the array: ");
		int len = ob.nextInt();
		System.out.println("Enter the elements of the array: ");
		int[] array = new int [len];
		for(int i = 0; i < len; i++) {
		array[i] = (ob.nextInt());
		}
		ob.close();
		String str = "";
		int sum = 0;
		int n = (int)Math.pow(2, array.length);
		for(int i = 0; i < n; i++)
		{
		int temp = i;
		str = "";
			for(int j = array.length - 1; j >= 0; j--)
			{
				int bin = temp % 2;
				temp = temp / 2;
				
				if(bin == 0)
				{
					continue;
				}
				else {
					str = array[j] + str;
					sum = sum + array[j];
				}
			}
			subsets.add(str);
		}
		System.out.println("The subsets of the array are: ");
		for(String s: subsets) {
			System.out.println("("+ s + ")");
		}
		System.out.println("\n\n\t\tThe Sum of all the subset elements is = "+sum);
		System.out.println(
				"\n\n--------------------------------------------------------------------\n\t\t Made By - \u00a9Rishabh Tiwari\n--------------------------------------------------------------------");
		
		

	}

}
