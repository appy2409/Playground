#include <stdio.h>
int main() {
  int n,temp,sum,r;
  scanf("%d",&n);
  temp=n;
  while(temp>0)
  {
    r=temp%10;
    temp=temp/10;
    sum=sum+r;
  }
  printf("%d",sum);
	//Type your code
	return 0;
}