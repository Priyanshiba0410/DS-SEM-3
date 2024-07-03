import java.util.Scanner;
public class lab4_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter an element at index["+i+"]");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter index to delete number at that index");
        int index = sc.nextInt();

        for(int i=index;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        System.out.println("new array");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}