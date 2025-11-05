/*

3. Count All Pairs with Difference k
 Problem:
Find all pairs (i, j) such that |arr[i] - arr[j]| = k.
Example:
Input: arr = [1, 5, 3, 4, 2], k = 2  
Output: (1,3), (5,3), (3,1), (4,2)
*/
import java.util.*;

class CountPairsWithDiffArr3{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[5];
		int k =2;
		System.out.println("Enter Value in Array: ");
		
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		int count =0;
		boolean flag = false;
		System.out.println("Display Output: ");
		for(int i=0; i<a.length; i++){
			
			
			for(int j=i+1; j<a.length; j++){
				
				
				if((a[i] - a[j])== 2 ||(a[i] - a[j])== -2){
					
					count++;
					System.out.printf("(%d , %d)",a[i],a[j]);
					System.out.println();
					flag = true;
					
				}
				
			}
			
			
		}
		System.out.println("Count: " + count);
		if(flag==false){
			
			System.out.println("No Pairs");
			
		}
	}
}
