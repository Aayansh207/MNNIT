#include <stdio.h>

void binary(int n){
    if(n==0)
      return;
    binary(n/2);
    printf("%d",n%2);
}
int main(){
    int num;
    printf("Enter a positive integer: ");
    scanf("%d",&num);
    if (num==0) printf("Binary equivalent: 0");
    else{
        printf("Binary equivalent: ");
        binary(num);
    }
    printf("\n");
    return 0;
}

