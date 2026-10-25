#include <stdio.h>
int main(){
    int arr[20],p=0,n=0,e=0,o=0;
    printf("Enter 20 numbers: ");
    for(int i=0;i<20;i++) scanf("%d",&arr[i]);
    for(int i=0;i<20;i++){
        (arr[i]>0)?p++:(arr[i]<0)?n++:0;
        (arr[i]%2==0)?e++:o++;
    }
    printf("Positive: %d\n",p);
    printf("Negative: %d\n",n);
    printf("Even: %d\n",e);
    printf("Odd: %d\n",o);

    return 0;
}
