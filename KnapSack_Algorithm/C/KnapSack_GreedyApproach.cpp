#include<stdio.h>
#include<stdlib.h>
void sort(int n, double pw[], int p[], int w[], int obj[]){
	double temp_d = 0.0, temp=0;
	for (int i=0; i<n; i++){
		for (int j=0; j<(n-i-1); j++){
			if (pw[j] < pw[j+1]){
				temp_d = pw[j];
				pw[j] = pw[j+1];
				pw[j+1] = temp_d;
				
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
void display(int n, double pw[], int p[], int w[], int obj[]){
	printf("Objects = ");
	for (int i=0; i<n; i++){
		printf("%d	",obj[i]);
	}
	printf("\nPW = ");
	for (int i=0; i<n; i++){
		printf("%.2lf	",pw[i]);
	}
	printf("\nProfits = ");
	for (int i=0; i<n; i++){
		printf("%d	",p[i]);
	}
	printf("\nWeights = ");
	for (int i=0; i<n; i++){
		printf("%d	",w[i]);
	}
}
float knapSack (int n, int m, int p[], int w[], double pw[], int obj[]){
	sort(n, pw, p, w, obj);
	display(n, pw,p,w,obj);
	float pro = 0;int i=0;
	for (i=0; i<n; i++){
		if (m > 0 && w[i] <= m){
			m -= w[i];
			pro += p[i];
		}
		else{
			break;
		}
	}
	if (m > 0){
		pro += (float)p[i] * ((float)m / (float)w[i]);
	}
	return pro;
}

int main(){
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
	double pw[n]={0};
	int obj[n] = {0};
	for (int i=0; i<n; i++){
		pw[i] = ((float)profit[i] / (float)weights[i]);
		obj[i] = i+1;
	}
	float result = knapSack(n,m,profit,weights,pw,obj);
	printf("\nTotal Profit is :- %f",result);
	return 0;
}
