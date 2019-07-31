#include<stdio.h>
int main()
{
char s[50];
  int l,i,count=1;
  scanf("%s",s);
  for(l=0;s[l]!='\0';l++);
    if(l>20)
    {
      printf("Invalid Input");
    }
    else
    {
      for(i=0;i<=l;i++)
      {
        if(s[i]==s[i+1])
        {
          count++; 
        }
        else
        {
            printf("%c%d",s[i],count);
          count=1;
        }  
      }
    }
  return 0;
   }
   
    
           