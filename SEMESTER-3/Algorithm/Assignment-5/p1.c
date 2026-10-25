#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int partition(int a[], int low, int high){
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

void quickSort(int a[], int low, int high){
    if(low<high){
        int pi=partition(a,low,high);
        quickSort(a,low,pi-1);
        quickSort(a,pi+1,high);
    }
}

double getTime(int a[], int n){
    clock_t start,end;
    start=clock();
    quickSort(a,0,n-1);
    end=clock();
    return (double)(end-start)/CLOCKS_PER_SEC;
}

int main(){
    FILE *f=fopen("quick.dat","w");
    srand(time(NULL));
    fprintf(f,"# n worst average\n");
    for(int n=1000;n<=20000;n+=1000){
        int worst[n],avg[n];
        for(int i=0;i<n;i++){
            worst[i]=i;
            avg[i]=rand();
        }
        fprintf(f,"%d %lf %lf\n",n,getTime(worst,n),getTime(avg,n));
    }
    fclose(f);
    return 0;
}