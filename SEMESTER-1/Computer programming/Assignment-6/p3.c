#include <stdio.h>
int main(){
    int n;
    printf("Enter number of elements: ");
    scanf("%d",&n);
    int arr[n],s=0;
    printf("Enter elements: ");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
        s+=arr[i];
    }
    float avg=(float)s/n;
    printf("sum=%d\n",s);
    printf("Average=%f\n",avg);
    return 0;
}
