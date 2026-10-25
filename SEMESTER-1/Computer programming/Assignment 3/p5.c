#include<stdio.h>

int main(){
  int n;
  int answer=0;
  printf("Enter the number : ");
  scanf("%d",&n);
  for(int i=2;i<n;i++){
    if(n%i==0){answer=1;break;}
  }
  if(answer){printf("The number is not prime\n");}
  else{printf("The number is prime\n");}
}
