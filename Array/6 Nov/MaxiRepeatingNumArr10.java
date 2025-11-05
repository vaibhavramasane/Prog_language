/*

Q10. Write a program in java to find the maximum repeating number in a given array.
The array range is [0..n-1] and the elements are in the range [0..k-1] and k<=n..
 Expected Output:
 The given array is:
 2 3 3 5 3 4 1 7 7 7 7
 The maximum repeating number is: 7

*/

import java.util.*;

class MaxiRepeatingNumArr10{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		int a[] = {2 ,3, 3, 5, 3, 4, 1,7, 7, 7, 7};
		
		int max = Integer.MIN_VALUE;
		
		int maxcount =0;
		int maxelement =-1;
		for(int i=0; i<a.length; i++){
			
			int count =0;
			//System.out.println("Window.....>[");
			for(int j=0; j<a.length; j++){
				
				
				if(a[i] == a[j]){
					
					count++;
					
				}
				
				
			}

			if(count > max){
				
				maxcount = count;
				maxelement=a[i];
				
			}
		}
		System.out.printf("The Maximum repeating number is %d\n",maxelement);
			
	}
}
