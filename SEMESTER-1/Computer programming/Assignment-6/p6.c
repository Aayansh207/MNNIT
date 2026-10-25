#include <stdio.h>
int main(){
    int n;
    int arr[n];
    printf("Enter number of elements: ");
    scanf("%d",&n);
    printf("Enter elements: ");
    for(int i=0;i<n;i++) scanf("%d",&arr[i]);
    int answer=-1;
    for(int i=0;i<n;i++){
        if((i==0||arr[i]>=arr[i-1])&&(i==n-1||arr[i]>=arr[i+1])){
            answer=arr[i];
            break;}
    }
    if(answer==-1){printf("No peak element");}
    else{printf("answer: %d\n",answer);}
}
