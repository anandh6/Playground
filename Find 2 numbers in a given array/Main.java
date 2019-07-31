#include<stdio.h>
int main()
{int i, n, a, b, x=-1,y=-1;
 scanf("%d",&n);
 int s[n] ;
 for(i=0;i<n;i++)
 {
   scanf("%d",&s[i] );
 }
 scanf("%d%d", &a, &b);
 for(i=0;i<n;i++)
 {
   if(a==s[i]&&x==-1)
   {
     x=i;
   }
   if(b==s[i]&&y==-1)
   {
     y=i;
   }
 }
 printf("Element 1 index = %d\nElement 2 index = %d",x,y) ;
  return 0; 
  
}