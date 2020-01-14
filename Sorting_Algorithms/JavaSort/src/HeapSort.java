import java.util.*;
public class HeapSort {
	public static void heapify(int a[], int n, int i){
		int largest = i;
		int l = 2*i + 1;
		int r = 2*i + 2;
		
		if(l<n && a[l]>a[largest]){
			largest = l;
		}
		if(r<n && a[r]>a[largest]){
			largest = r;
		}
		
		if(largest != i){
			int temp = a[i];
			a[i] = a[largest];
			a[largest] = temp;
			
			heapify(a, n, largest);
		}
	}
	public static void heapSort(int a[], int n){
		for (int i = n/2 - 1; i>=0; i--){
			heapify(a, n, i);
		}
		for (int i = n-1; i>=0; i--){
			int temp = a[0];
			a[0] = a[i];
			a[i] = temp;
			
			heapify(a, i, 0);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Range :- ");
		int n = in.nextInt();
		int a[] = new int [n];
		System.out.println("Enter Elements in the Arrays :- \n");
		for (int i=0;i<n;i++){
			a[i] = in.nextInt();
		}
		System.out.println("Unsorted Array is :- \n");
		for (int i=0;i<n;i++){
			System.out.print(a[i] + " ");
		}
		heapSort(a,n);
		System.out.println("\nSorted Array is :- \n");
		for (int i=0;i<n;i++){
			System.out.print(a[i] + " ");
		}
		in.close();
	}
}
