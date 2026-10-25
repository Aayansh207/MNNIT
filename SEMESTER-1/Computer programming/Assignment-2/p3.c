#include<stdio.h>

int main(){
  int a,b;
  printf("Enter the first value");
  scanf("%d",&a);
  printf("Enter the second value");
  scanf("%d",&b);
  a=a+b;
  b=a-b;
  a=a-b;
  printf("a : %d \n",a);
  printf("b : %d \n",b);
  return 0;
  }

