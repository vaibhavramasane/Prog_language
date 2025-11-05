/*

6. Count Number of Even and Odd Elements
 Problem:
Count how many even and odd elements are present.
Example:
Input: [1, 2, 3, 4, 5, 6]  
Output: Even: 3, Odd: 3

*/
import java.util.*;

class CountEvenOddArr6{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[6];
		System.out.println("Enter Values in Array: ");
		
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		
		int evencount = 0;
		int oddcount =0;
		for(int i=0; i<a.length; i++){
			
			if(a[i] % 2 ==0){
				
				evencount++;
				
			}else{
				
				oddcount++;
				
			}
		}
		System.out.println("Even:" + evencount);
		System.out.println("Odd: " + oddcount);
		
	}
}
