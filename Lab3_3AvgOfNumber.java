import java.util.*;
public class Lab3_3AvgOfNumber {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n Number:" );
        int n= sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        double avg=sum/n;
        System.out.print(avg);
    }
}