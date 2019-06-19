#include <stdio.h>
int main() {
	int n,i,j,sum,k,m,o,s;
  k=0,m=0,o=0;
  
  sum=0;
  scanf("%d",&n);
  s=n;
  while(s!=0)
  {
    m++;
    s=s/10;
    
  }
  
  while(n!=0)
  {
    
    k=n%10;
    if(o==0||o==m-1)
    {
      sum=sum+k;
    }
    o++;
    n=n/10;
  }
  printf("%d",sum);
	return 0;
}