#include<stdio.h>
int main()
{
  int n,sum,i,k;
  scanf("%d",&n);
  while(n!=0)
  {
    k=n%10;
    sum=sum+k;
    n=n/10;
  }    
  printf("%d",sum);
  return 0;
}