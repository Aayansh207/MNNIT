#include<stdio.h>

int main(){
  int n;
  printf("Enter the marks : ");
  scanf("%d",&n);
  if(n>=85){printf("Grade : A+\n");}
  else if(n>=75){printf("Grade : A\n");}
  else if(n>=65){printf("Grade : B+\n");}
  else if(n>=50){printf("Grade : B\n");}
  else if(n>=30){printf("Grade : C\n");}
  else{printf("Fail\n");}
}
