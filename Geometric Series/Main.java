#include<stdio.h>
int main()
{
 int n, a, r, t_s1, t_s2, nt;
  scanf("%d", &n) ;
  if(n%2==1)
  {
   a=1,r=2;
    t_s1=(n+1)/2;
    nt=a*pow(r,t_s1-1);
    printf("%d",nt);
  }
  else
  {
    a=1,r=3;
    t_s2=n/2;
    nt=a*pow(r,t_s2-1);
    printf("%d",nt);
  }
  return 0;
}
 
