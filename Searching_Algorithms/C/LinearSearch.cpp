#include<stdio.h>
#include<stdlib.h>

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
	for (int i=0;i<n;i++)
	{
		if (target == arr[i])
		{
			printf ("\nYour element %d is present at index position %d.",target,i);
			flag ++;
		}
	}
	if (flag == 0){
		printf ("Element not Found!");
	}
	return 0;
	
}
