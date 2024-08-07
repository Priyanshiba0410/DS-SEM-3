import java.util.*;
public class BinarySearch
 {
    public static int binarySearch(int[] arr, int temp) 
    {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == temp) {
                return mid; 
            } else if (arr[mid] < temp) {
                left = mid + 1; 
            } else {
                right = mid - 1;
            }
        }

        return -1;   
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range of arr");
            int n = sc.nextInt();
            int []arr = new int[n];
            for(int i=0;i<arr.length;i++)
            {
                System.out.print("enter an element of index"+ (i)+"  : ");
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<arr.length;i++)
            {
                System.out.println("arr["+i+"]"+arr[i]);
            }
        System.out.println("enter element");
        int tempElement =sc.nextInt();
        int result = binarySearch(arr, tempElement);
        if (result != -1)
         {
            System.out.println("Element " + tempElement + " found at index " + result);
        } else {
            System.out.println("Element " + tempElement + " not found in the array.");
        }
    }
}
