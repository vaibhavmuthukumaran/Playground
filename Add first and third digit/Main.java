#include<stdio.h>
int main()
{
 int i,k,m,sum,n;
  sum=0;
  scanf("%d",&n);
  m=0;
  while(n!=0)
  {
    k=n%10;
    m++;
    if(m!=2)
    sum=sum+k;
    n=n/10;
  }
  printf("%d",sum);
}