#include <stdio.h>
#include <stdlib.h>
#include <time.h>

long long comparisons=0;

int partition(int a[],int l,int r){
    int p=a[r];
    int i=l-1;
    for(int j=l;j<r;j++){
        comparisons++;
        if(a[j]<=p){
            i++;
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
        }
    }
    int t=a[i+1];
    a[i+1]=a[r];
    a[r]=t;
    return i+1;
}

void quickSort(int a[],int l,int r){
    if(l<r){
        int p=partition(a,l,r);
        quickSort(a,l,p-1);
        quickSort(a,p+1,r);
    }
}

int main(){
    int n;
    scanf("%d",&n);
    int *a=malloc(n*sizeof(int));
    for(int i=0;i<n;i++) scanf("%d",&a[i]);
    clock_t s=clock();
    quickSort(a,0,n-1);
    clock_t e=clock();
    for(int i=0;i<n;i++) printf("%d ",a[i]);
    printf("\n");
    printf("Number of comparisons : %lld\n",comparisons);
    printf("Total time taken : %f\n",(double)(e-s)/CLOCKS_PER_SEC);
    free(a);
    return 0;
}

