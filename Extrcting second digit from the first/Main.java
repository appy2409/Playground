#include <stdio.h>
int main() {
  int n,temp,r;
  scanf("%d",&n);
  temp=n;
  while(temp>10)
  {
    r=temp%10;
    temp=temp/10;
  }
  printf("%d",r);
	//Type your code
	return 0;
}