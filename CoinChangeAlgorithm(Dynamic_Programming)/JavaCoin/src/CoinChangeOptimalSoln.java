import java.util.*;
public class CoinChangeOptimalSoln {
	public static int count(int a[],int m,int n)
	{
		if(n == 0)
		{
			return 1;
		}
		if(n < 0)
		{
			return 0;
		}
		if(m<=0 && n>=1)
		{
			return 0;
		}
		return count(a, m-1, n) + count(a ,m, n-a[m-1]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Enter total number of Coins :- ");
		n = in.nextInt();
		System.out.println("Enter types of Coins :- ");
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = in.nextInt();
		}
		System.out.println("Enter total Denomination :- ");
		int m = in.nextInt();
		System.out.println("Result is :- "+count(a,n,m));
	}
}
