
import java.util.Scanner;
class quickSort{
    public void Sort(int[] arr,int low,int high){
     
        if(low<high){
         int pi=Partition(arr,low,high);   
         
         Sort(arr,low,pi-1);
         Sort(arr,pi+1,high);
        }
        
    }
    public int Partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
                int temp=arr[i+1];
                arr[i+1]=arr[high];
                arr[high]=temp;
                
                return i+1;
    }
    public void Diplay(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class QuickSort {
    public static void main(String[] args) {
    int[] arr={5,6,2,3,1,8,4};
    quickSort q=new quickSort();
    q.Sort(arr, 0, arr.length-1);
    q.Diplay(arr);  
    }
    
}