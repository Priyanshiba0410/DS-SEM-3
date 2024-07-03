import java.util.Scanner;
public class Factorial{
	public static void main(String[] args) {
		int sum=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter NO.");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			sum = sum*i;
		}
		System.out.println(sum);
	}
}