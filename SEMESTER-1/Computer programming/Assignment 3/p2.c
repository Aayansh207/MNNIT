#include<stdio.h>

int main(){
  int n;
  printf("Enter the year : ");
  scanf("%d",&n);
  n%4!=0 ? printf("Not a leap year\n"):(
    n%100!=0 ? printf("Leap year\n"):(
      n%400!=0 ? printf("Not a leap year\n"):printf("Leap Year\n")
      )
  ); 
}
