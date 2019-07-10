#include <stdio.h>
int main() {
  int n,l,temp,r,sum;
  scanf("%d",&n);
  temp=n;
  l=n%10;
  while(temp>0)
  {
    r=temp%10;
   temp=temp/10;
  }
  sum=r+l;
  printf("%d",sum);
	//Type your code
	return 0;
}