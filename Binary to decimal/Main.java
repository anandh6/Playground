#include<stdio.h>
#include<math.h>
int main()
{
  int i, n, s=0,r;
  scanf("%d",&n);
  while(n!=0)
  {
    r=n%10;
    s=s+r*pow(2,i);
    n=n/10;
    i++;
  }
  printf("%d",s);
  return 0;
}