/*
Move Zeros to End
Move all 0s to the end of the array while maintaining the order of non-zero elements.

*/
import java.util.*;

class NonZeroElement{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		
		int a[] = new int[5];
		System.out.println("Enter VAlue in Array: ");
		
		int j=0; // pointer for non-zero elements
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		// 1 2 0 0 3
		for(int i=0; i<a.length; i++){
			
			if(a[i]!=0){ //0
				
				if(i!=j){ // 3!=2
					//Swapping 
					int temp = a[i]; //3
					a[i] = a[j];//
					a[j] = temp;
					
				}
				
			j++;//2
			}
			
		}
		for(int i=0; i<a.length; i++){
			
			System.out.print(a[i] + " ");
			
		}
	}
	
}