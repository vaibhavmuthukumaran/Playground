#include <stdio.h>
#include<math.h>
int main() {
int i,j,k=0,l,m,n,sum=0;
  scanf("%d",&n);
  m=n;
  while(m>0)
  {
    m=m/10;
    k++;
  }
  l=n;
  while(l>0)
  {
    j=l%10;
    sum=sum+pow(j,k);
    l=l/10;
  }
  if(sum==n)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}