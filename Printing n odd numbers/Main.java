#include <stdio.h>
int main() {
	int n,i,m;
  m=0;
  scanf("%d",&n);
  for(i=1;i<=100;i++)
  {
    
    if(i%2!=0)
    {
      if(m<n)
      {
      printf("%d\n",i);
        m++;
      }
    }
  }
	return 0;
}