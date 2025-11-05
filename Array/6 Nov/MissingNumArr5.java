/*
5. Find Missing Number in 1 to N
Problem:
Find a missing number from 1 to N in array of N-1 size.
Example:
Input: [1, 2, 4, 5], N = 5  
Output: 3
*/
import java.util.*;

class MissingNumArr5{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		
		System.out.println("Enter Size of Array: ");
		int N = xyz.nextInt();
		
		int arr[] = new int[4];
		System.out.println("Enter Values In Array: ");
		
		for(int i=0; i<arr.length; i++){
			
			arr[i] = xyz.nextInt();
		
		}
		
		//for missing elemnets
		System.out.println("Missing Elements : ");
		for(int i=0; i<arr.length-1; i++){
			
			if(arr[i] - arr[i+1]!=1){
				
				while(arr[i]+1 < arr[i+1]){
					
					System.out.println(++arr[i]);
					
					
				}
			}
		}
	}
}
