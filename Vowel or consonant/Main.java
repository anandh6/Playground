#include<stdio.h>
int main()
{
 char c;
  scanf("%c", & c) ;
  if(c=='a'||c=='e' ||c=='o' ||c=='u' ||c=='i' ||c=='A' ||c=='E' ||c=='O' ||c=='U' ||c=='I')
  {
    printf("Vowel") ;
  }
else
{
  printf("Consonant") ;
}
  return 0;
}