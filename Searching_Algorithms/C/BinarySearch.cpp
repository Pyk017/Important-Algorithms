#include<stdio.h>
#include<stdlib.h>
void sorted(int[],int);
int main()
{
	int n,arr[30],target,flag = 0;
	printf("Enter Range :- \n");
	scanf("%d",&n);
	printf("Enter elements in the Array :- \n");
	for (int i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf ("Enter element to be searched in the Array :- \n");
	scanf("%d",&target);
	sorted(arr,n);
	int lb = 0,ub = n-1,mid = 0;
	while (lb<=ub)
	{
		mid = (lb+(ub-1))/2;
		if (target == arr[mid])
		{
			printf ("\nYour element %d found at index position %d.",target,mid);
			flag = 1;
			break;
		}
		else if (target < arr[mid])
		{
			ub = mid-1;
		}
		else{
			lb = mid +1;
		}
	}
	if (flag == 0)
	{
		printf ("Element not FounD!");
	}
	return 0;
}
void sorted(int a[],int n)
{
	int key=0,j=0;
	for (int i=1;i<n;i++)
	{
		key = a[i];
		j = i-1;
		while (j>=0 && key<a[j])
		{
			a[j+1] = a[j];
			j--;
		}
		a[j+1] = key;
	}
}
