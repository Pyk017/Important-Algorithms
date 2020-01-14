import java.util.*;
public class BubbleSort {
	
	public static void bubbleSort(int a[],int n)
	{
		int temp=0;
		for(int i=0;i<(n-1);i++)
		{
			for(int j=0;j<(n-i-1);j++)
			{
				if(a[j+1] < a[j])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter range :- ");
		int n = in.nextInt();
		System.out.println("Enter elements in the Array :- ");
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i] = in.nextInt();
		
		bubbleSort(a,n);
		System.out.println("Sorted Array is :- ");
		for(int i=0;i<n;i++)
			{
				System.out.print(a[i]+" ");
			}
}
}
