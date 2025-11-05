/*
Q8. Write a program in java to count the number of inversion in a given array
Expected Output :
 The given array is : 1 9 6 4 5
 The inversions are: (9, 6) (9, 4) (9, 5) (6, 4) (6, 5)
 The number of inversion can be formed from the array is: 5
 */
 
 import java.util.*;
 
 class CountNumInversionArr8{
	 
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter Values in Array: ");
		
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		int count =0;
		System.out.println("The given array are : " );
		for(int i=0; i<a.length; i++){
			
			System.out.print(a[i] + " ");
			
		}
		System.out.println();
		System.out.println("The inversions are: ");
		for(int i=0; i<a.length; i++){
			
			for(int j=i+1; j<a.length; j++){
				
				if(a[i] > a[j]){
					
					count++;
					System.out.printf("( %d , %d)" ,a[i],a[j]);
					System.out.println();
					
				}
			}
		}
		System.out.println("The number of inversion can be formed from the array is:" + count);
		
	}
 }
 
					
					
					