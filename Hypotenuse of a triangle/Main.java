#include<stdio.h>
int main()
{
 float hyp, ad, op;
  scanf("%f%f", & ad, & op) ;
  hyp=sqrt((ad*ad) +(op*op));
  printf("%.2f",hyp);
  return 0;
}