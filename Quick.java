import java.util.Scanner;

class Ab {
    // QuickSort method to recursively sort the array
    void QuickSort(int a[], int low, int high) {
        if (low < high) {
            // Get the pivot index after partitioning
            int pivot = partition(a, low, high);
            // Recursively sort the left and right sub-arrays
            QuickSort(a, low, pivot - 1);  // Left sub-array
            QuickSort(a, pivot + 1, high); // Right sub-array
        }
    }

    // Method to swap two elements in the array
    void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // Method to partition the array and return the pivot index
    int partition(int a[], int low, int high) {
        int pivot = a[low]; // Choose the pivot (first element)
        int i = low;
        int j = high;

        while (i < j) {
            // Find an element larger than or equal to pivot from the left
            while (a[i] <= pivot) {
                i++;
            }
            // Find an element smaller than or equal to pivot from the right
            while (a[j] > pivot) {
                j--;
            }
            // Swap elements if they are in the wrong order
            if (i < j) {
                swap(a, i, j);
            }
        }

        // Swap the pivot with the element at the j index to place it in its correct position
        swap(a, j, low);
        return j; // Return the pivot index
    }
}

public class Quick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ab ob = new Ab();
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3}; // Sample array
        int low = 0;
        int high = arr.length - 1; // Correct the high value (array length - 1)

        System.out.println("Before Sorting:");
        // Print the array before sorting
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Perform quick sort
        ob.QuickSort(arr, low, high);

        // After sorting, print the sorted array
        System.out.println("\nAfter Sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Print a newline for better output formatting

        sc.close(); // Close the scanner to avoid resource leaks
    }
}
