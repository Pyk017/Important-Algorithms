#include<stdio.h>
#include<stdlib.h>
int count(int a[],int m,int n)
{
	if(n == 0)
	{
		return 1;
	}
	if(n < 0)
	{
		return 0;
	}
	if(m<=0 && n>=1)
	{
		return 0;
	}
	return count(a,m-1,n) + count(a, m, n-a[m-1]);
}
int main()
{
	int n;
	int a[20];
	printf("Enter total number of coins :- ");
	scanf("%d",&n);
	printf("Enter types of coins :- ");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	int m;
	printf("Enter total denomination :- ");
	scanf("%d",&m);
	int result = count(a,n,m);
	printf("Result is :- %d",result);
	return 0;
}
