#include <stdio.h>
int main() {
	int i,j,k,n,sum,no;
  sum=0;
  int fact;
  scanf("%d",&n);
  no=n;
  while(n!=0)
  {
    k=n%10;
    fact=1;
    for(i=k;i>0;i--)
    {
      fact=fact*i;
      
    }
    sum=sum+fact;
    
    n=n/10;
  }
 
  if(sum==no)
  {
    printf("Yes");
  }
  else
  {
    printf("No");
  }
	return 0;
}