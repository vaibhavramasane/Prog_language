/*
Find Intersection of Two Sorted Arrays
Return the intersection of two sorted arrays using two pointers.
*/

import java.util.*;

class IntersectionArr {
    public static void main(String x[]) {
        Scanner xyz = new Scanner(System.in);

        int a[] = new int[5];
        int b[] = new int[5];
        
        System.out.println("Enter Value In First Sorted Array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = xyz.nextInt();
        }

        System.out.println("Enter Value In Second Sorted Array:");
        for (int i = 0; i < b.length; i++) {
            b[i] = xyz.nextInt();
        }

        // Two-pointer approach
        int i = 0, j = 0;
        System.out.print("Intersection Of Two Array: ");
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                System.out.print(a[i] + " ");
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
		// it's was optimize code but when we give another size of array it's not working
		
		
	}
}
 