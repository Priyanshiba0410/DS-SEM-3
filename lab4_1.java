import java.util.Scanner;
public class lab4_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.print("enter an element of index"+(i+1));
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter number to insert");
        int num = sc.nextInt();
        System.out.println("Enter index to insert the number");
        int index = sc.nextInt();

        for(int i=n;i>=index;i--){
            arr[i]=arr[i-1];
        }
        arr[index] = num;
        System.out.println("new array");
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}