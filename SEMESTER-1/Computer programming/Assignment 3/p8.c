#include<stdio.h>

int main(){
  int n=0;
  printf("Enter the number : ");
  scanf("%d",&n);
  int answer=1;
  for(int i=1;i<=n;i++){
    answer*=i;
  }
  printf("The factorial is : %d \n",answer);
}
