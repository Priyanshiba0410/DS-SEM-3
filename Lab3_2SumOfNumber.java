import java.util.*;
public class Lab3_2SumOfNumber {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter m Number:" );
        int m= sc.nextInt();
        System.out.print("Enter n Number:" );
        int n= sc.nextInt();
        int sum=0;
        if(m<n){
        for(int i=m;i<n;i++){
            sum=sum+i;
        }
    }
    else if(m>n){
        for(int i=n;i<m;i++){
            sum=sum+i;
        }
    }
    else{
        System.out.print("Enter Valid Number");
    }
    System.out.print(sum);
    }
}