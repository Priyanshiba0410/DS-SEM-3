import java.util.Scanner;
public class lab3_5DuplicateNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the value of array index"+(i+1));
            arr[i]=sc.nextInt();
        }
        boolean foundDuplicate = false;
        for(int j=0;j<arr.length;j++){
            for(int k=j+1;k<arr.length;k++){
                if(arr[j]==arr[k]){
                    foundDuplicate = true;
                    break;
                }
            }

        }
        if(foundDuplicate){
            System.out.println("array contains duplicate number");
        }
        else{
         System.out.println("array does not contains duplicate number");
        }               
    }
}