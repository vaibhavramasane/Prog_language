
/*
Sum of Two Numbers Equals Target
Given a sorted array and a target, check if there are two numbers that sum up to the target.
*/

import java.util.*;
class TwoNumEqualTargert{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		//int a[] = {2,7,11,15,17};
		int a[] = new int[5];
		System.out.println("Enter Value in Array:");
		
		int start = 0;
		int target = 22;
		int end = a.length-1;
		boolean Istarget = false;
		
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		
		while(start<end){
			
			if(a[start] + a[end] < target){
				
				start++;
				
			}else if(a[start] + a[end] > target){
				
				end--;
				
			}else{
				
				System.out.println(a[start] + " " + a[end]);
				Istarget = true;
				break;
			
			}
			
		}
		if(!Istarget){
				
			System.out.println(" No Pair Found with Sum=22");
		}
		
	}
}