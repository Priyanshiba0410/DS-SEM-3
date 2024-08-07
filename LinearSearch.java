import java.util.*;
public class LinearSearch
 {
    public static int linearSearch(int[] arr, int temp)
     {
        for (int i = 0; i < arr.length; i++)
         {
            if (arr[i] == temp)
             {
                return i; 
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
                System.out.print("enter an element of index"+(i+1));
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<arr.length;i++)
            {
                System.out.println("arr["+i+"]"+arr[i]);
            }
        System.out.println("enter element");
        int tempElement =sc.nextInt();

        int result = linearSearch(arr, tempElement);

        if (result != -1) 
        {
            System.out.println("Element " + tempElement + " found at index " + result);
        }
         else 
        {
            System.out.println("Element " + tempElement + " not found in the array.");
        }
    }
}
