#include<stdio.h>
#include<stdlib.h>
int subset_sum(int a[], int k, int n){
	int c[n+1][k+1] = {0};
	for(int i=0; i<=n; i++){
		for(int j=0; j<=k; j++){
			if (i == 0 and j != 0){
				c[i][j] = 0;
			}
			else if(j == 0){
				c[i][j] = 1;
			}
			else if(j < a[i-1]){
				c[i][j] = c[i-1][j];
			}
			else{
				if(c[i-1][j-a[i-1]] || c[i-1][j]){
					c[i][j] = 1;
				}
				else{
					c[i][j] = 0;
				}
			}
		}
	}
	printf("Resultant Matrix is :- \n");
	for(int i=0; i<=n; i++){
		for(int j=0; j<=k; j++){
			printf("%d  ", c[i][j]);
		}
		printf("\n");
	}
	return c[n][k];
}
int main(){
	int n, a[50], k;
	printf("Enter Range :- ");
	scanf("%d", &n);
	printf("Enter elements in the Array :- \n");
	for(int i=0; i<n; i++){
		scanf("%d", &a[i]);
	}
	printf("Enter The Total Sum :- ");
	scanf("%d",&k);
	if(subset_sum(a, k, n)){
		printf("\nSubset is Possible!");
	}
	else{
		printf("\nSubset is not Possible!");
	}
	return 0;
}
