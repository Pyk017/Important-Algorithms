#include<stdio.h>
#include<stdlib.h>
int knapsack(int n, int c, int p[], int w[]){
	int t[n+1][c+1];
	for (int i=0; i<=c; i++){
		t[0][i] = 0;
	}
	for (int i=0; i<=n; i++){
		t[i][0] = 0;
		for(int j=0; j<=c; j++){
			if ((w[i-1] <= j) && (t[i-1][j-w[i-1]]+p[i-1] > t[i-1][j])){
				t[i][j] = t[i-1][j-w[i-1]] + p[i-1];
			}
			else{
				t[i][j] = t[i-1][j];
			}
		}
	}
	return t[n][c];
	
}
int main()
{
	int n, m;
	printf("Enter total number of Objects :- ");
	scanf("%d",&n);
	printf("Enter total quantity of KnapSack :- ");
	scanf("%d",&m);
	int profit[n], weights[n];
	printf("Enter profits of the Objects :- ");
	for (int i=0; i<n; i++){
		scanf("%d",&profit[i]);
	}
	printf("Enter weights of the Objects :- ");
	for (int i=0; i<n; i++){
		scanf("%d",&weights[i]);
	}
	printf("Maximum Profit is :- %d", knapsack(n, m, profit, weights));
	return 0;
}
