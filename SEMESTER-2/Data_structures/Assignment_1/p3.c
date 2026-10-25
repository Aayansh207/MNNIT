#include <stdio.h>

void binary(int n,int b){
    if(n==0)
      return;
    binary(n/b,b);
    printf("%d",n%b);
}
int main(){
    int num,base;
    printf("Enter a positive integer: ");
    scanf("%d",&num);
    printf("Enter the base: ");
    scanf("%d",&base);
    if (num==0) printf("The number 0 in base %d is : 0",base);
    else printf("The number %d in base %d is : ",num,base);
    binary(num,base);
    printf("\n");
    return 0;
}

