import java.util.*;
public class Sub_Set_Sum {
	public static boolean subset(int a[], int n, int k) {
		boolean c[][] = new boolean[n+1][k+1];
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=k; j++) {
				if (i == 0 && j != 0){
					c[i][j] = false;
				}
				else if(j == 0){
					c[i][j] = true;
				}
				else if(j < a[i-1]){
					c[i][j] = c[i-1][j];
				}
				else{
					c[i][j] = c[i-1][j] || c[i-1][j-a[i-1]];
				}
			}
		}
		System.out.println("Resultant Array is :- ");
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=k; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		return c[n][k];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter range:- ");
		int n = in.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements in the Arrays :- ");
		for(int i=0; i<n; i++) {
			a[i] = in.nextInt();
		}
		System.out.println("Enter Total Sum :- ");
		int k = in.nextInt();
		if(subset(a, n, k)) {
			System.out.println("Subset Possible!");
		}
		else {
			System.out.println("Subset not Possible!");
		}
	}

}
