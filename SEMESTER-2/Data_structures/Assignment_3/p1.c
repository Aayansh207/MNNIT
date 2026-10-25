#include <stdio.h>
#include <stdlib.h>
#include <time.h>

long long comparisons=0;

void merge(int a[],int l,int m,int r){
    int i=l,j=m+1,k=0;
    int n=r-l+1;
    int *t=malloc(n*sizeof(int));
    while(i<=m&&j<=r){
        comparisons++;
        if(a[i]<=a[j]) t[k++]=a[i++];
        else t[k++]=a[j++];
    }
    while(i<=m) t[k++]=a[i++];
    while(j<=r) t[k++]=a[j++];
    for(i=0;i<n;i++) a[l+i]=t[i];
    free(t);
}

void mergeSort(int a[],int l,int r){
    if(l<r){
        int m=(l+r)/2;
        mergeSort(a,l,m);
        mergeSort(a,m+1,r);
        merge(a,l,m,r);
    }
}

int main(){
    int n;
    scanf("%d",&n);
    int *a=malloc(n*sizeof(int));
    for(int i=0;i<n;i++) scanf("%d",&a[i]);
    clock_t s=clock();
    mergeSort(a,0,n-1);
    clock_t e=clock();
    for(int i=0;i<n;i++) printf("%d ",a[i]);
    printf("\n");
    printf("Number of comparisons :  %lld\n",comparisons);
    printf("Total time taken : %f\n",(double)(e-s)/CLOCKS_PER_SEC);
    free(a);
    return 0;
}

