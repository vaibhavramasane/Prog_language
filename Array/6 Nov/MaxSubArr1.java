/*1. Find the Maximum Subarray Sum (Brute Force)
 Problem:Find the maximum sum of any subarray.
Example:
Input: [-2, 1,  -3,   4,   -1,  2,  1,   -5.  ,4]  
Output: 6.  (from subarray [4,-1,2,1])
*/
import java.util.*;

class MaxSubArr1{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[9]; //[ 1,3,-1,-3,5,3,6,7]
		int k=4;
		System.out.println("Enter Values in Array: ");
		
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		int max = Integer.MIN_VALUE;
		
		
		for(int i=0; i<=a.length-k; i++){
			
			int sum =0;
			System.out.println("Window.....>[");
			for(int j=i; j<(i+k); j++){
				
				sum = sum + a[j];
				System.out.printf("%d ,",a[j]);
				
			}
			System.out.printf("]= %d\n",sum);
			if(sum > max){
				
				max = sum;
				
			}
		}
		System.out.printf("Max Value is %d\n",max);
			
			
	}
}

		
		