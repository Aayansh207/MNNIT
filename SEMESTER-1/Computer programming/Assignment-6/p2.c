#include <stdio.h>
int main(){
    int n;
    printf("Enter number of elements: ");
    scanf("%d",&n);
    int arr[n];
    printf("Enter elements: ");
    for(int i=0;i<n;i++) scanf("%d",&arr[i]);
    int mi=arr[0],ma=arr[0];
    for(int i=1;i<n;i++){
        if(arr[i]<mi) mi=arr[i];
        if(arr[i]>ma) ma=arr[i];
    }
    printf("Minimum = %d\n",mi);
    printf("Maximum = %d\n",ma);
    return 0;
}
