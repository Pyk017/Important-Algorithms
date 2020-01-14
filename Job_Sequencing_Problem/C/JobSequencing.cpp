#include<stdio.h>
#include<stdlib.h>
void sort(int n, int p[], int d[], int obj[]){
	int temp;
	for(int i=0; i<n; i++){
		for(int j=0; j<(n-i-1); j++){
			if (p[j] < p[j+1]){
				temp = p[j];
				p[j] = p[j+1];
				p[j+1] = temp;
				
				temp = d[j];
				d[j] = d[j+1];
				d[j+1] = temp;
				
				temp = obj[j];
				obj[j] = obj[j+1];
				obj[j+1] = temp;
			}
		}
	}
}
void display(int n, int p[], int d[], int obj[]){
	printf("Jobs are :- ");
	for(int i=0; i<n; i++){
		printf("%d	",obj[i]);
	}
	printf("\nProfits are :- ");
	for(int i=0; i<n; i++){
		printf("%d	",p[i]);
	}
	printf("\nDeadLines are :- ");
	for(int i=0; i<n; i++){
		printf("%d	",d[i]);
	}
}
int max(int n, int d[]){
	int maxi = 0;
	for(int i=1; i<n; i++){
		if (d[i] > d[maxi]){
			maxi = i;
		}
	}
	return d[maxi];
}
int jobsequencing(int n, int p[], int d[], int obj[]){
	sort(n, p, d, obj);
	int profit=0;
	int result[max(n,d)] = {0};
	for(int i=0; i<n; i++){
		for(int j=d[i]-1; j>=0; j--){
			if (result[j] == 0){
				result[j] = obj[i];
				profit += p[i];
				break;
			}
		}
	}
	display(n,p,d,obj);
	printf("\nResulting Gantt Chart of Jobs is :- ");
	for(int i=0; i<(max(n, d)); i++){
		printf("%d	",result[i]);
	}
	return profit;
}
int main(){
	int n;
	printf("Enter total number of Jobs :- ");
	scanf("%d",&n);
	int deadline[n],profit[n],obj[n];
	printf("Enter profits :- \n");
	for(int i=0; i<n; i++){
		scanf("%d",&profit[i]);
		obj[i] = i+1;
	}
	printf("Enter DeadLines :- \n");
	for(int i=0; i<n; i++){
		scanf("%d",&deadline[i]);
	}
	int result = jobsequencing(n,profit,deadline,obj);
	printf("\nMaximum Profit is :- %d",result);
	return 0;
}
