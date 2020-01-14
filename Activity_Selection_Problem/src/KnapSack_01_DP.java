import java.util.*;
public class KnapSack_01_DP {
	public static int knapsack(int n, int c, int p[], int w[]) {
		
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Enter total number of Objects :- ");
		int n, c;
		n = in.nextInt();
		System.out.println("Enter total Capacity of the Knapsack :- ");
		c = in.nextInt();
		int profit[] = new int[n];
		int weight[] = new int[c];
		System.out.println("Enter profits of the Objects :- ");
		for (int i=0; i<n; i++){
			profit[i] = in.nextInt();
		}
		System.out.println("Enter weights of the Objects :- ");
		for (int i=0; i<n; i++){
			weight[i] = in.nextInt();
		}
		
	}

}
