import java.util.*;
public class Activity_Selection_Algorithm {
	public static void sort(int n, int a[], int b[], int c[]) {
		int temp=0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<(n-i-1); j++) {
				if (a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
					temp = b[j];
					b[j] = b[j+1];
					b[j+1] = temp;
					
					temp = c[j];
					c[j] = c[j+1];
					c[j+1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter total number of activities :- ");
		int n = in.nextInt();
		int start[] = new int[n];
		int finish[] = new int[n];
		int obj[] = new int[n];
		System.out.println("Enter Starting Activities :- ");
		for (int i=0; i<n; i++) {
			start[i] = in.nextInt();
			obj[i] = i+1;
		}
		System.out.println("Enter Finishing Activities :- ");
		for (int i=0; i<n; i++) {
			finish[i] = in.nextInt();
		}
		sort(n, finish, start, obj);
		ArrayList<Integer> al = new ArrayList<Integer>();
		int j=0;
		al.add(1);
		for(int i=1; i<n; i++)
		{
			if (start[i] >= finish[j]) {
				al.add(obj[i]);
				j = i;
			}
		}
		System.out.print("Selected Activities are :- ");
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		in.close();
	}
}
