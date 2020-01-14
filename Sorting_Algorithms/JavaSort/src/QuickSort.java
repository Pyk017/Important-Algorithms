import java.util.*;
public class QuickSort {
	public static void Quick_Sort(int a[],int low,int high)
	{
		if(low < high)
		{
			int mid = Partition(a,low,high);
			Quick_Sort(a,low,mid-1);
			Quick_Sort(a,mid+1,high);
		}
	}
	public static int Partition(int a[],int low,int high)
	{
		int i= (low-1);
		int x = a[high];
		for(int j=low;j<high;j++)
		{
			if(a[j] <= x){
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int temp = a[i+1];
		a[i+1] = a[high];
		a[high] = temp;
		return i+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Range :- ");
		int n = in.nextInt();
		System.out.println("Enter elements in the Array :- ");
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = in.nextInt();
		}
		Quick_Sort(a,0,n-1);
		System.out.println("Sorted Elements in the Array is :- ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		in.close();
	}
}
