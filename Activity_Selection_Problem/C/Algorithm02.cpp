#include<stdio.h>
#include<stdlib.h>
void sort(int n, int a[], int b[], int c[]){
	int temp;
	for (int i=0; i<n; i++){
		for (int j=0; j<(n-i-1); j++){
			if (a[j] > a[j+1]){
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
int main(){
	int s[10] = {1,2,3,4,7,8,9,9,11,12};
	int f[10] = {3,5,4,7,10,9,11,13,12,14};
	int obj[10] = {1,2,3,4,5,6,7,8,9,10};
	int result[10] = {0};
	int n = 10;
	sort(n, f, s, obj);
	result[0] = 1;
	int j=0;
	for (int i=1; i<n; i++){
		if (s[i] >= f[j]){
			result[i] = obj[i];
			j = i;
		}
	}
	for (int i=0; i<n; i++){
		printf("%d	",result[i]);
	}
	return 0;
}
