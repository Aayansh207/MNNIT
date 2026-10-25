#include<stdio.h>

int sumdiv(int n){
  int count=0;
  for(int i=1;i*i<=n;i++){
    if(n%i==0){
      if(i!=n) count+=i;
      if(i*i!=n && i!=1) count+=n/i;
    }
  }
  return count;
}
int main(){
  int n;
  printf("Enter the number : ");
  scanf("%d",&n);
  int count=sumdiv(n);
  //printf("%d",count);
  if(count==n){printf("The number is a perfect number\n");}
  else{printf("The number is not a perfect number\n");}
  return 0;
}
