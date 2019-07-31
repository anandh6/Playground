#include<stdio.h>
int main()
{
  int a, b, hcf, Lcm, i;
  scanf("%d%d",&a, &b);
  i=(a>b)? b:a;
 for(;i>=1;i--)
 {
   if(a%i==0&&b%i==0)
   {
     hcf=i;
     break;
   }
 }
  Lcm=(a*b)/hcf;
  printf("%d",Lcm);
  return 0;
}