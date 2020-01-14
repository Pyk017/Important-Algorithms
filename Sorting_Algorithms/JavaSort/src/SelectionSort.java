import java.util.*;
public class SelectionSort {

	public static void selectionSort(int a[],int n)
	{
		int min = 0,temp;
		for(int i=0;i<(n-1);i++)
		{
			min = i;
			for(int j=i;j<n;j++)
			{
				if(a[min] > a[j])
				{
					min = j;
				}
			}
			temp = a[min];
			a[min] = a[i];
			a[i] = temp;
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
		
		selectionSort(a,n);
		System.out.println("Sorted Array is :- ");
		for(int i=0;i<n;i++)
			{
				System.out.print(a[i]+" ");
			}
	}

}
