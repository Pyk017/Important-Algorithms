import java.util.*;
public class MaxSumSubArrayProblemKadaneAlgo {

	public static int maximum(int a,int b)
	{
		if(a > b)
		{
			return a;
		}
		return b;
	}
	public static int maxi(int a[],int n)
	{
		int max_current =0,max_global = 0;
		for(int i=0;i<n;i++)
		{
			max_current = maximum(a[i], max_current + a[i]);
			if(max_current > max_global)
				max_global = max_current;
		}
		return max_global;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter range :- ");
		int n = in.nextInt();
		int a[] = new int[n];
//		int b[] = new int [n];
		System.out.println("Enter elements in the Array :- ");
		for(int i=0;i<n;i++)
			a[i] = in.nextInt();
		
		System.out.println(" Maximum Sum of the Subarray of Array is :- "+maxi(a,n));	
	}
}
