/*
2. Check for Triplets with Zero Sum
Problem:
Check if any three elements in the array sum to 0.
Example:
Input: [-1, 0, 1, 2, -1, -4]  
Output: (-1, 0, 1), (-1, -1, 2)

*/
import java.util.*;

class TripletZeroSumArr2 {
    public static void main(String x[]) {
        Scanner xyz = new Scanner(System.in);
        int a[] = new int[6];
        //int k = 3;
        System.out.println("Enter Value Of array: ");

        for (int i = 0; i < a.length; i++) {
			
            a[i] = xyz.nextInt();
			
        }
		/*
        for (int i = 0; i <= a.length - k; i++) {
			
            int sum = 0;
			
            for (int j = i; j < (i + k); j++) {
				
                sum = sum + a[j];
				
            }

            if (sum == 0) {
				
                for (int j = i; j < (i + k); j++) {  
				
                    System.out.printf("%d ", a[j]);
					
                }
				
                System.out.println();
            }
        }
		*/
		
		System.out.println("Triplet With sum are:");
		boolean flag = false;
		for(int i=0; i<a.length-2; i++){
			
			for(int j=0; j<a.length-1; j++){
				
				for(int p=0; p<a.length; p++){
					
					if(a[i] + a[j] + a[p] == 0){
						
						System.out.printf("(%d , %d ,%d)\n",a[i],a[j],a[p]);
						flag =  true;
					}
				}
			}
		}
		if(!flag){

			System.out.println("Triplet not found");
		}
		
    }
}
