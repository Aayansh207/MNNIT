#include<stdio.h>

int main(){
  int n;
  int answer=0;
  printf("Enter the number : ");
  scanf("%d",&n);
  while(n>=1){
    answer=answer*10+n%10;
    n=n/10;
  }
  printf("Reversed number : %d \n",answer);
}
