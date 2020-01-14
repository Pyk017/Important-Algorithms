#include<stdio.h>
#include<stdlib.h>
int maxi(int a[],int n)
{
	int max=0;
	for(int i=1;i<n;i++)
	{
		if(a[max] < a[i])
		{
			max = i;
		}
	}
	return a[max];
}
int main()
{
	int n,a[20],b[20] = {0};
	printf("Enter range :- ");
	scanf("%d",&n);
	printf("Enter elements in the Array :- \n");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(int i=0;i<n;i++)
		printf("%d ",a[i]);
	printf("\n");
	int max=0,p=0,i=0;
	for(i=0;i<(n-1);i++)
	{
		max = p = a[i];
		for(int j=(i+1);j<n;j++)
		{
			p += a[j];
			if(max < p)
				max = p;
		}
		b[i] = max;
		max = p = 0;
	}
	b[n-1] = a[n-1];
	for(int i=0;i<n;i++)
		printf("%d ",b[i]);
	printf("\n");
	printf(" Maximum Sum of the Subarray of Array is :- %d",maxi(b,n));
	return 0;
}
