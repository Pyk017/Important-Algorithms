#include<stdio.h>
#include<stdlib.h>
int profits[] = {1,2,3,4,5,6,7,8,9};
int weights[] = {1,1,1,1,1,1,1,1,1};
int i=0;
int max(int a, int b){
	if (a > b){
		return a;
	}
	return b;
}
int ks(int n, int c){
	if (n == 0 || c == 0){
		i += 1;
		return 0;
	}
	else if (weights[i] >= c){
		return ks(n-1, c);
	}
	else{
		return max(profits[i] + ks(n-1, c-weights[i]), ks(n-1, c));
	}
}
int main(){
	int n=10;
	int c = 10;
	printf("%d	",ks(n, c));
	return 0;
}
