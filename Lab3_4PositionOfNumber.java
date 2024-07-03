import java.util.*;
public class Lab3_4PositionOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range of arr");
            int n=sc.nextInt();
            int []arr=new int[n];
            for(int i=0;i<n;i++){
                System.out.print("enter an element of index"+(i+1));
                arr[i]=sc.nextInt();
            }
            int largestIndex=0;
            for(int i=0;i<n;i++){
                if(arr[i]>arr[largestIndex]){
                    largestIndex=i;
                }
            }
            int smallestIndex=0;
            for(int i=0;i<n;i++){
                if(arr[i]<arr[smallestIndex]){
                    smallestIndex=i;
                }
            }
            System.out.print("largest no is :"+arr[largestIndex]);
            System.out.print("smallest no is :"+arr[smallestIndex]);
}
}