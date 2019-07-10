#include <stdio.h>
int main() {
	//Type your code
  int m,n,i,fact,r,sum=0;
  scanf("%d",&n);
  m=n;
  while(n)
  { i=1,fact=1;
  	r=n%10;
 	 while(i<=r)
 	 {
  		fact=fact*i;
  		  i++;
  	 }
   sum=sum+fact;
   n=n/10;
  }
  if(sum==m)
    printf("Yes");
  else
    printf("No");
	return 0;
}