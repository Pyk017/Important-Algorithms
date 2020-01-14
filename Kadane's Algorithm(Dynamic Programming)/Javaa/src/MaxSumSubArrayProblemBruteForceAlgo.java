import java.util.*;
public class MaxSumSubArrayProblemBruteForceAlgo {

	public static int maxi(int a[],int n)
	{
		int max = 0;
		for(int i=0;i<n;i++)
		{
			if(a[max] < a[i])
				max = i;
		}
		return a[max];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Enter range :- ");
		int n = in.nextInt();
		int a[] = new int[n];
		int b[] = new int [n];
		System.out.println("Enter elements in the Array :- ");
		for(int i=0;i<n;i++)
			a[i] = in.nextInt();
		
		int max,p,i;
		for(i=0;i<(n-1);i++)
		{
			max = p = a[i];
			for(int j=(i+1);j<n;j++)
			{
				p += a[j];
				if(max < p)
					max = p;
			}
			b[i] = max;
			max = p = 0;
		}
		b[n-1] = a[n-1];
		System.out.println(" Maximum Sum of the Subarray of Array is :- "+maxi(b,n));
	}

}
