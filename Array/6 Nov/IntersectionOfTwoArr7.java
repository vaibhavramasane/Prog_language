/* 
7. Find Intersection of Two Arrays
 Problem:
Print common elements in two arrays using brute force.
Example:
Input: arr1 = [1, 2, 3], arr2 = [2, 3, 4]  
Output: 2, 3
*/
import java.util.*;

class IntersectionOfTwoArr7{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		
		int a1[] = {1, 2, 3};
		int a2[] = {2, 3, 4}; 
		
		boolean InterSect = false;
		
		for(int i=0; i<a1.length; i++){
			
			for(int j=0; j<a2.length; j++){
				
				if(a1[i] == a2[j]){
					InterSect=true;
					System.out.print(a1[i] + " ");
					break;
					
				}
			}
		}
		if(!InterSect){
			
			System.out.println("There is No Intersection Of Two Array");
			
		}
	}
}

			
					