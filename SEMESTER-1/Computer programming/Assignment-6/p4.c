#include <stdio.h>
int main(){
    int n;
    printf("Enter number of elements: ");
    scanf("%d",&n);
    int arr[n];
    printf("Enter elements: ");
    for(int i=0;i<n;i++) scanf("%d",&arr[i]);
    int new[n],j=0;
    for(int i=0;i<n;i++) if(arr[i]%2==0){new[j]=arr[i];j++;}
    for(int i=0;i<n;i++) if(arr[i]%2!=0){new[j]=arr[i];j++;}
    printf("New Array: ");
    for(int i=0;i<n;i++) printf("%d ",new[i]);
    printf("\n");
    return 0;
}
