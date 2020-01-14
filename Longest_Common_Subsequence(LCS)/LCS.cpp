#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int max(int a, int b){
	if (a >= b){
		return a;
	}
	return b;
}
void display(int c[][50], int m, int n){
	for(int i=0; i<=m; i++){
		for(int j=0; j<=n; j++){
			printf("%d	",c[i][j]);
		}
		printf("\n");
	}
}
char* lcs(char *a, char *b){
	int m = strlen(a);
	int n = strlen(b);
	int c[50][50] = {0};
	for(int i=1; i<=m; i++){
		for (int j=1; j<=n; j++){
			if(a[i-1] == b[j-1]){
				c[i][j] = 1 + c[i-1][j-1];
			}
			else{
				c[i][j] = max(c[i-1][j], c[i][j-1]);
			}
		}
	}
	printf("Array after :- \n");
	display(c, m, n);
	int i = m, j = n;
	int index = c[m][n];
	char str[index+1];
	str[index] = '\0';
	while(i > 0 && j > 0){
		if(a[i-1] == b[j-1]){
			str[index - 1] = a[i-1];
			i--;
			j--;
			index--;
		}
		else if(c[i-1][j] > c[i][j-1]){
			i--;
		}
		else{
			j--;
		}
	}
	return str;
}

int main(){
	char x[50], y[50];
	printf("Enter First String :- ");
	gets(x);
	printf("Enter Second String :- ");
	gets(y);
	char *result;
	result = lcs(x, y);
	printf("\nLongest Common Subsequence is :- %s of length %d",result, strlen(result));
	return 0;
}
