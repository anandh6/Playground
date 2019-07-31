#include<stdio.h>
int main()
{
int a, d, n, even, odd, term;
  scanf("%d", & n) ;
  if(n%2==1)
  {
    a=0,d=2;
    odd=(n+1)/2;
    term=a+(odd-1)*d;
    printf("%d",term);
  }
  else
  {
    a=0,d=1;
    even=n/2;
    term=a+(even-1)*d;
    printf("%d",term);
  }
  return 0;
	
}