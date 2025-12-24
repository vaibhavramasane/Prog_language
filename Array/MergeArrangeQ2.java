//
import java.util.*;

class MergeArrangeQ2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];

        System.out.println("Enter First Array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter Second Array");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        // Reverse second array
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            int temp = b[i];
            b[i] = b[j];
            b[j] = temp;
        }

        int c[] = new int[a.length + b.length];
        int k = 0;

        for (int i = 0; i < n; i++) {
            c[k++] = a[i];
            c[k++] = b[i];
        }

        System.out.println("Merged Array:");
        for (int x : c) {
            System.out.print(x + " ");
        }
    }
}