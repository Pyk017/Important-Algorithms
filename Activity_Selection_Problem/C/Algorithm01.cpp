#include<stdio.h>
#include<stdlib.h>
int main(){
	int s[10] = {1,2,3,4,7,8,9,9,11,12};
	int f[10] = {3,5,4,7,10,9,11,13,12,14};
	int result[10] = {0};
	int n = 10;
	result[0] = 1;
	int j = 0;
	for (int i=1; i<n; i++){
		if (s[i] >= f[j]){
			result[j+1] = i+1;
			j += 1;
		}
	}
	for (int i=0; i<n; i++){
		printf("%d	",result[i]);
	}
	return 0;
}
