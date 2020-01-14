import java.util.*;
public class InsertionSort {
	public static void insertionSort(int a[],int n)
	{
		int key,j=0,i;
		for(i=1;i<n;i++)
			{
				key = a[i];
				j = i-1;
				while(j>=0 && key<a[j])
				{	a[j+1] = a[j];
					j--;
				}
				a[j+1] = key;
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
		
		insertionSort(a,n);
		System.out.println("Sorted Array is :- ");
		for(int i=0;i<n;i++)
			{
				System.out.print(a[i]+" ");
			}
	}

}
