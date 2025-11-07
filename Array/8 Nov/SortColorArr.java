/*
Sort Colors (Dutch National Flag Problem)
Sort an array of 0s, 1s, and 2s using two/three pointers.
*/

import java.util.*;

class SortColorArr{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[5];
		
		System.out.println("Enter Values: ");
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		
		int start =0,i=0;
		int end = a.length-1;
		while(i<=end){
			
			if(a[i] ==0){
				int temp = a[i];
				a[i] = a[start];
				a[start] = temp;
				start++;
				i++;
				
			}else if(a[i] == 2){
				int temp = a[i];
				a[i] = a[end];
				a[end] = temp;
				end --;
				
			}else{
				
				i++;
				
			}
		}
		System.out.println("Sorted Array: " + Arrays.toString(a));
    
	}
}