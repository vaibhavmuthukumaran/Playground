#include <stdio.h>
int main() {
	int n,fact,i;
  fact=1;
  scanf("%d",&n);
  for(i=n;i>0;i--)
    fact=fact*i;
  
  printf("%d",fact);
  
	return 0;
}