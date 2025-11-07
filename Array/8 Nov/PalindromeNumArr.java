/*
Check Palindrome Using Two Pointers
Check if a string is a palindrome using the two-pointer approach.
*/
import java.util.*;

class PalindromeNumArr{
	
	public static void main(String x[]){
		 
		Scanner xyz = new Scanner(System.in);
		//int a[] = { 1, 2 ,3 ,2 ,1};
		int a[] = new int[5];
		System.out.println("Enter Values in Array: ");
		
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		
		int start =0;
		int end =(a.length-1);
		boolean flag = true;
		
		while(start<=end){
			
			if(a[start] != a[end]){
				
				flag = false;
				break;
			}
			start++;
			
			end--;
		}
		if(flag){
			
			System.out.println("Array is Palindrome");
			
		}else{
			
			System.out.println("Array is not Palindrome");
			
		}
	}
}
				
				