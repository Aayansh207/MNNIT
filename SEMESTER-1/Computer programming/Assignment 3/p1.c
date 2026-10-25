#include<stdio.h>

int main(){
  int n;
  printf("Enter the year : ");
  scanf("%d",&n);
  if(n%100==0 && n%400!=0){printf(" Not a Leap Year\n");}
  else if(n%4==0){printf("Leap Year\n");}
  else{printf("Not a leap year\n");}
}
