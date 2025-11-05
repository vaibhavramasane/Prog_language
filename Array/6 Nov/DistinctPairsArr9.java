/*
Q9. Write a program in java to count all distinct pairs for a specific difference
Expected Output:
 The given array is:
 5 2 3 7 6 4 9 8
 The distinct pairs for difference 5 are: [7, 2] [8, 3] [9, 4]
 Number of distinct pairs for difference 5 are: 3
*/
import java.util.*;

class DistinctPairsArr9{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[8];
		int k=5;
		System.out.println("Enter Numbers: ");
		
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		int count =0;
		boolean flag = false;
		System.out.println("Display Output: ");
		for(int i=0; i<a.length; i++){
			
			for(int j=i+1; j<a.length; j++){
				
				if(a[i] -a[j] == 5 || a[i] - a[j] == -5){
					count++;
					flag = true;
					System.out.printf("(%d ,%d)",a[i],a[j]);
					break;
					
				}
			}
			
		}
		System.out.println(" Number of distinct pairs for difference 5 are : "  + count);
		if(flag==false){
			
			System.out.println("There Is No distinct pairs");

		}
	}

}	
		
		