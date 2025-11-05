/*
4. Check If Array Is Sorted
 Problem:
Determine whether an array is sorted in non-decreasing order.
Example:
Input: [1, 2, 2, 3, 4]  
Output: true
*/

import java.util.*;

class SortedArr4{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		int a[] = {1,2,3,4};
		boolean issort = false;
		for(int i=0; i<a.length; i++){
			
			System.out.println(a[i]);
			
		}
		for(int i=0; i<a.length; i++){
			
			for(int j=i+1; j<a.length; j++){
				
				if(a[i]<=a[j]){
					
					issort = true;
					
					break;
					
				}
				
			}
			
		}
		if(issort==false){
			
			System.out.println("TRUE");
			
		}else{
			
			System.out.println("False");
		}
	}
}

			