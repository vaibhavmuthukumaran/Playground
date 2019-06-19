#include <stdio.h>
int main() {
	int n,sum,second,i,j,k,m,a[20],b[20];
  
  scanf("%d",&n);
  m=0;
  i=0;k=0;sum=0;
  while(n!=0)
  {
    k=n%10;
    a[m]=k;
    m++;
    n=n/10;
  }
  printf("%d",a[m-2]);
	return 0;
}