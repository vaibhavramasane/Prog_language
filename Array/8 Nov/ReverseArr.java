/*
Reverse an Array In-Place
Reverse an array using the two-pointer technique.
*/

import java.util.*;

class ReverseArr{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		//int a[] = {1,2,3,4,5};
		int a[] = new int[5];
		System.out.println("Enter Values in Array:");
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		
		
		int start =0;
		int end = a.length-1;
		System.out.println("After Reverse Value: ");
		while(start<=end){
			
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
			
		}
		for(int i=0; i<a.length; i++){
			
			System.out.println(" " + a[i]);
			
		}
		
		
		
		
	}
}