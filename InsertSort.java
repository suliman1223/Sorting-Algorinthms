
import java.util.Scanner;
class Node{
    void sorrt(int arr[]){
    for(int i=0;i<arr.length;i++){
        int temp=arr[i];
        int j=i-1;
        while(j>=0&&arr[j]>temp){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=temp;
    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
}

public class InsertSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node ob=new Node();
        int []arr={8,4,1,5,9,2};
        ob.sorrt(arr);
    }
}
