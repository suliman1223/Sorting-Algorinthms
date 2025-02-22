import java.util.Scanner;

class Node {
    // Corrected swap method
    void swap(int arr[], int min1, int ii) {
        int temp = arr[min1]; // Store the value at min1 index
        arr[min1] = arr[ii]; // Assign the value at ii index to min1 index
        arr[ii] = temp;      // Assign the stored value to ii index
    }

    // Selection sort method
    void Sorrrt(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i; // Assume the current index is the minimum
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) { // Find the minimum element
                    min = j;
                }
            }
            if (min != i) {
                swap(a, min, i); // Swap the current element with the minimum element
            }
        }

        // Print the sorted array
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node ob = new Node();
        int[] arr = {4, 1, 9, 2, 3, 6};

        System.out.println("Array before sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Array after sorting:");
        ob.Sorrrt(arr);
    }
}
