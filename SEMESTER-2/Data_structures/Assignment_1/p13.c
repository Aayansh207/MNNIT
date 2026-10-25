#include<stdio.h>

int main(){
    int n,key;
    printf("Enter array size: ");
    scanf("%d",&n);

    int arr[n];
    printf("Enter elements:\n");
    for(int i=0;i<n;i++) scanf("%d",&arr[i]);

    printf("Enter element to search: ");
    scanf("%d",&key);

    for(int i=0;i<n;i++){
        if(arr[i]==key){
            printf("Element found at index %d\n",i);
            return 0;
        }
    }

    printf("Element not found\n");
    return 0;
}
