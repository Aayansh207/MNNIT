#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void merge(int a[],int l,int m,int r){
    int n1=m-l+1;
    int n2=r-m;
    int left[n1],right[n2];
    for(int i=0;i<n1;i++){left[i]=a[l+i];}
    for(int i=0;i<n2;i++){right[i]=a[m+1+i];}
    int i=0,j=0,k=l;
    while(i<n1 && j<n2){
        if(left[i]<=right[j]){a[k++]=left[i++];}
        else{a[k++]=right[j++];}
    }
    while(i<n1){a[k++]=left[i++];}
    while(j<n2){a[k++]=right[j++];}
}

void mergeSort(int a[],int l,int r){
    if(l>=r){return;}
    int m=l+(r-l)/2;
    mergeSort(a,l,m);
    mergeSort(a,m+1,r);
    merge(a,l,m,r);
}

int partition(int a[],int low,int high){
    int pivot=a[high];
    int i=low-1;
    for(int j=low;j<high;j++){
        if(a[j]<pivot){
            i++;
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }
    int temp=a[i+1];
    a[i+1]=a[high];
    a[high]=temp;
    return i+1;
}

void quickSort(int a[],int low,int high){
    if(low<high){
        int pi=partition(a,low,high);
        quickSort(a,low,pi-1);
        quickSort(a,pi+1,high);
    }
}

double getMergeTime(int a[],int n){
    clock_t start,end;
    start=clock();
    mergeSort(a,0,n-1);
    end=clock();
    return (double)(end-start)/CLOCKS_PER_SEC;
}

double getQuickTime(int a[],int n){
    clock_t start,end;
    start=clock();
    quickSort(a,0,n-1);
    end=clock();
    return (double)(end-start)/CLOCKS_PER_SEC;
}

int main(){
    FILE *f=fopen("compare.dat","w");
    srand(time(NULL));
    fprintf(f,"# n merge quick\n");
    for(int n=1000;n<=20000;n+=1000){
        int mergeArray[n];
        int quickArray[n];
        for(int i=0;i<n;i++){
            int x=rand();
            mergeArray[i]=x;
            quickArray[i]=x;
        }
        double mergeTime=getMergeTime(mergeArray,n);
        double quickTime=getQuickTime(quickArray,n);
        fprintf(f,"%d %lf %lf\n",n,mergeTime,quickTime);
    }
    fclose(f);
    return 0;
}