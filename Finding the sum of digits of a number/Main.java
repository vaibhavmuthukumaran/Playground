#include <stdio.h>
int main() {
	int n,sum,a[20],i,j,k;
  scanf("%d",&n);
  i=0;k=0;sum=0;
  while(n!=0)
  {
    k=n%10;
    sum=sum+k;
    n=n/10;
  }
  printf("%d",sum);
	return 0;

	
}