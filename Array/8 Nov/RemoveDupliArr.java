/*

Remove Duplicates from Sorted Array
Remove duplicates from a sorted array using two pointers and return new length.

*/

import java.util.Scanner;
public class RemoveDupliArr
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = {2,2,3,3,4,6,6};
		//original array
		System.out.println("Original Array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}

		
		int rd = 0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[rd]!=arr[i])
			{
				rd++;
				arr[rd] = arr[i];
			}
		}
		System.out.println();
		System.out.println("Array without duplicates.");	
		for(int i=0;i<=rd;i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("The length of the new array is : "+(++rd));	
	}
}