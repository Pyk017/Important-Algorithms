import java.util.*;
public class KnapSack_Greedy {
	public static void display(int n, int p[], int w[], int obj[], double pw[]) {
		System.out.print("Objects are :- ");
		for (int i=0; i<n; i++) {
			System.out.print(obj[i]+" ");
		}
		System.out.print("\nProfits are :- ");
		for (int i=0; i<n; i++) {
			System.out.print(p[i]+" ");
		}
		System.out.print("\nWeights are :- ");
		for (int i=0; i<n; i++) {
			System.out.print(w[i]+" ");
		}
		System.out.print("\nProfit/Weight ratio are :- ");
		for (int i=0; i<n; i++) {
			System.out.print(pw[i]+" ");
		}
	}
	public static void sort(int n, int p[], int w[], int obj[], double pw[]) {
		int temp=0; double t=0;
		for (int i=0; i<n; i++) {
			for (int j=0; j<(n-i-1); j++) {
				if (pw[j] < pw[j+1]) {
					
					t = pw[j];
					pw[j] = pw[j+1];
					pw[j+1] = t;
					
					temp = p[j];
					p[j] = p[j+1];
					p[j+1] = temp;
					
					temp = w[j];
					w[j] = w[j+1];
					w[j+1] = temp;
					
					temp = obj[j];
					obj[j] = obj[j+1];
					obj[j+1] = temp;
					
				}
			}
		}
	}
	public static double knapSack (int n, int m, int p[], int w[], int obj[], double pw[]) {
		sort(n,p,w,obj,pw);
		double profit = 0;int i=0;
		for (i=0; i<n; i++) {
			if (m > 0 && w[i] <= m) {
				m -= w[i];
				profit += p[i];
			}
			else {
				break;
			}
		}
		if (m > 0) {
			profit += ((double)m * ((double)p[i] / (double)w[i]));
		}
		return profit;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Enter total number of objects :- ");
		int n = in.nextInt();
		System.out.println("Enter total Capacity of the KnapSack :- ");
		int m = in.nextInt();
		int profit[] = new int[n];
		int weight[] = new int[n];
		double pw[] = new double[n];
		int obj[] = new int[n];
		System.out.println("Enter profits of the objects :- ");
		for (int i=0; i<n; i++) {
			profit[i] = in.nextInt();
			obj[i] = i+1;
		}
		System.out.println("Enter weights of the objects :- ");
		for (int i=0; i<n; i++) {
			weight[i] = in.nextInt();
		}
		for (int i=0; i<n; i++) {
			pw[i] = (double)profit[i] / (double)weight[i];
		}
		double result = knapSack(n,m,profit,weight,obj,pw);
		display(n,profit,weight,obj,pw);
		System.out.println("\nMaximum Profit is :- "+result);
		in.close();
	}
}
