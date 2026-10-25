#include <stdio.h>

int main() {
    int n;
    printf("Enter number of elements: ");
    scanf("%d",&n);
    int arr[n];
    printf("Enter elements: ");
    for (int i=0;i<n;i++) scanf("%d",&arr[i]);
    for (int i=0;i<n-1;i+=2){
        int temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
    }
    printf("New Array : ");
    for (int i=0;i<n;i++) printf("%d ",arr[i]);
    printf("\n");
    return 0;
}

