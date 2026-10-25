#include <stdio.h>

int main(){
  int a;int b;int c;
  printf("Enter the first number : ");
  scanf("%d",&a);
  printf("Enter the second number : ");
  scanf("%d",&b);
  printf("Enter the third number : ");
  scanf("%d",&c);
  if(a>=b && a>=c){printf("first number is the largest \n");}
  else if(b>=c && b>=a){printf("Second number is the largest \n");}
  else{printf("Third number is the largest \n");}
}
