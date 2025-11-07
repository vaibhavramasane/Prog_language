/*
Count Pairs with Given Sum
Count how many pairs in an unsorted array sum up to a target using two pointers.
*/



import java.util.*;

class CountPairSum {

    public static void main(String x[]) {
        Scanner xyz = new Scanner(System.in);

        int a[] = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < a.length; i++) {
            a[i] = xyz.nextInt();
        }

        int target = 3;
        Arrays.sort(a); // two pointer works on sorted array

        int start = 0;
        int end = a.length - 1;
        int count = 0;

        while (start < end) {
            int sum = a[start] + a[end];

            if (sum == target) {
                System.out.println("Pair: (" + a[start] + ", " + a[end] + ")");
                count++;
                start++;
                end--;
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }

        System.out.println("Total Pairs = " + count);
    }
}
