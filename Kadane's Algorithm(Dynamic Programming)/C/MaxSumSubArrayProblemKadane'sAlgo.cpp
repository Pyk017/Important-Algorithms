#include<stdio.h>
#include<stdlib.h>
int maxi(int a,int b)
{
	if(a>b)
	{
		return a;
	}
	return b;
}
int maximum(int a[],int n)
{
	int max_current = 0,max_global = 0;
	max_current = max_global = a[0];
	for(int i=1;i<n;i++)
	{
		max_current = maxi(a[i], max_current + a[i]);
		if(max_current > max_global)
			max_global = max_current;
	}
	return max_global;
}

int main()
{	int n,a[20];
	printf("Enter range :- ");
	scanf("%d",&n);
	printf("Enter elements in the Array :- \n");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("Your Array is :- \n");
	for(int i=0;i<n;i++)
		printf("%d ",a[i]);
	printf("\n");
	
	printf(" Maximum Sum of the Subarray of Array is :- %d",maximum(a,n));
	return 0;
}
