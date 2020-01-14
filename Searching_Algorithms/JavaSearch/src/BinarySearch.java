import java.util.*;
public class BinarySearch {

	public static void sort(int a[],int n)
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
	static int mid=0;
	public static int search(int a[],int l,int h,int target)
	{
		while(l<h)
		{
			mid = (l+h)/2;
			if(a[mid] == target)
				return mid+1;
			else if(target<mid)
				return search(a,l,mid-1,target);
			else
				return search(a,mid+1,h,target);
		}
		return 0;
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
		System.out.println("Enter element to be Searched from the Array :- ");
		int target = in.nextInt();
		sort(a,n);
		System.out.println("Element found at Position :- "+search(a,0,n,target));
	}
}
