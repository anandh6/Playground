#include<stdio.h>
int main()
{
 char s[100];
  int  l=0,i;
  scanf("%[^\n]s",s);
  for(i=0;s[i]!='\0';i++)
  {
    l++;
  } 
  printf("%d", l);
  return 0;
}