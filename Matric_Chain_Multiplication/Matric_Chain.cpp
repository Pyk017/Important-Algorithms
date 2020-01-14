#include<stdio.h>
#include<stdlib.h>
int matric_chain(int p[], int n){
	int m[50][50] = {0};
	int j=0, q=0;
	for(int l=2; l<n; l++){
		for(int i=1; i<(n-l+1); i++){
			j = i+l-1;
			m[i][j] = INT_MAX;
			for(int k=i; k<=(j-1); k++){
				int q = m[i][k] + m[k+1][j] + (p[i-1] * p[k] * p[j]);
				if(q < m[i][j]){
					m[i][j] = q;
				}
			}	
		}
	}
	return m[1][n-1];
}
int main(){
	int n;
	printf("Enter number of matrices :- ");
	scanf("%d", &n);
	printf("Enter Array of Dimentions :- \n");
	int p[n+1];
	for(int i=0; i<n; i++){
		scanf("%d", &p[i]);
	}
	int result = matric_chain(p, n);
	printf("Minimum number of Multiplication is :- %d",result);
	return 0;
}
