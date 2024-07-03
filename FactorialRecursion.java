import java.util.Scanner;
public class FactorialRecursion{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter no.");
	int n =sc.nextInt();
	int ans = fac(n);
	System.out.println(ans); }
		 public static int fac(int n)
		{
			if(n==1)
			{
				return 1;
			}
			else
			{
				return n*fac(n-1);
			}
		}
	}