import java.util.*;
public class Lab3_1ArrOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range of arr");
            int n=sc.nextInt();
            int []arr=new int[n];
            for(int i=0;i<arr.length;i++){
                System.out.print("enter an element of index"+(i+1));
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<arr.length;i++){
                System.out.print("arr["+i+"]"+arr[i]);
            }
    }
}