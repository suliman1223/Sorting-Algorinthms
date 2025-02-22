
import java.util.Scanner;

class Node{
    void swap(int a[],int i,int j){
     int temp=a[i];
     a[i]=a[j];
     a[j]=temp;
        
    }
    void Sortt(int a[]){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    swap(a,j+1,j);
                }
            }
        }
        System.out.println("\nAfter sorting!!!");
     for(int j=0;j<n;j++){
         System.out.print(a[j]+" ");
     }
     System.out.println();

    }

}
public class BubbleSort {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Node ob=new Node();
    int[]arr={5,7,4,1,2,11};
        System.out.println("Before Sorting!!!!");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    ob.Sortt(arr);
    
    }
}
