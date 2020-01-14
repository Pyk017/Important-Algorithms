import java.util.*;
public class LinearSearch {

	public static int search(int a[],int n,int target)
	{
		int i=0;
		for(i=0;i<n;i++)
			if(target == a[i])
				break;
		if (i != n)
			return i+1;
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
		System.out.println("Element found at Position :- "+search(a,n,target));
	}
}
