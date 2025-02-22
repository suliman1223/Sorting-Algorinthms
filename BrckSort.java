import java.util.Scanner;

class Abccca {
    void BrickSort(int a[], int n) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            int temp;

            
            for (int i = 1; i <= n - 2; i = i + 2) {
                if (a[i] > a[i + 1]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    isSorted = false;
                }
            }

           
            for (int i = 0; i <= n - 2; i = i + 2) {
                if (a[i] > a[i + 1]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
    }
}

public class BrckSort {
    public static void main(String[] args) {
        Abccca ob = new Abccca();
        int[] arr = {5, 2, 6, 12, 1, 7, 88, 55, 9, 10};
        int n = arr.length;

        System.out.println("Original Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        ob.BrickSort(arr, n);

        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
