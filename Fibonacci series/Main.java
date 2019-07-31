#include<stdio.h>
int main()
{
  int a=1,b=0,i,n,c;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    printf("%d ",b);
    c=a+b;
    b=a;
    a=c;
  }
  return 0;
}