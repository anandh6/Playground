#include<stdio.h>
int main()
{
  int i,n;
  int a[100];
  scanf("%d",&n);
  while(n!=0)
  {
    a[i++]=n%2;
    n=n/2;
  } 
  for(i=i-1;i>=0;i--)
  {
    printf("%d",a[i]);
  }
  return 0;
}