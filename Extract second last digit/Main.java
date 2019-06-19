#include<stdio.h>
int main()
{
  int i,k,m,n;
  scanf("%d",&n);
  m=0;
  while(n!=0)
  {
    m++;
    k=n%10;
    if(m==2)
      printf("%d",k);
    n=n/10;
  }
  return 0;
}